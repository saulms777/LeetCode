-- Better solution
SELECT
    machine_id,
    ROUND(SUM(IF(activity_type = 'end', timestamp, -timestamp))
              / COUNT(DISTINCT process_id), 3) processing_time
FROM Activity
GROUP BY machine_id;

-- Original solution
SELECT
    A1.machine_id,
    ROUND(AVG(A2.timestamp - A1.timestamp), 3) processing_time
FROM Activity A1 JOIN Activity A2
                      ON A1.machine_id = A2.machine_id
                          AND A1.process_id = A2.process_id
                          AND A1.activity_type = 'start'
                          AND A2.activity_type = 'end'
GROUP BY machine_id;