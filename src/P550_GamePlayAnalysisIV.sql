SELECT ROUND(COUNT(*) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) fraction
FROM Activity JOIN (
    SELECT player_id, DATE_ADD(MIN(event_date), INTERVAL 1 DAY) event_date
    FROM Activity
    GROUP BY player_id
) M USING (player_id, event_date);