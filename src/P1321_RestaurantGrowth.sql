WITH T AS (
    SELECT DISTINCT
        visited_on,
        SUM(amount) OVER (
            ORDER BY visited_on
            RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW
        ) amount
    FROM Customer
    ORDER BY visited_on
    LIMIT 18446744073709551615 OFFSET 6
    )
SELECT *, ROUND(amount / 7, 2) average_amount
FROM T;