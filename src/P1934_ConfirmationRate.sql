SELECT
    user_id,
    ROUND(SUM(IF(C.action = 'confirmed', 1, 0)) / COUNT(*), 2) confirmation_rate
FROM Signups S LEFT JOIN Confirmations C USING (user_id)
GROUP BY user_id;