WITH T AS (
    SELECT requester_id id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id id FROM RequestAccepted
)
SELECT id, COUNT(*) num
FROM T
GROUP BY id
ORDER BY num DESC
LIMIT 1;