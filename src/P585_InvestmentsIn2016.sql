WITH
    A AS (
        SELECT pid, tiv_2016
        FROM Insurance
        WHERE tiv_2015 IN (
            SELECT tiv_2015
            FROM Insurance
            GROUP BY tiv_2015
            HAVING COUNT(*) > 1
        )
    ),
    B AS (
        SELECT pid, tiv_2016
        FROM Insurance
        WHERE pid IN (
            SELECT pid
            FROM Insurance
            GROUP BY lat, lon
            HAVING COUNT(*) = 1
        )
    )
SELECT ROUND(SUM(A.tiv_2016), 2) tiv_2016
FROM A JOIN B USING (pid);