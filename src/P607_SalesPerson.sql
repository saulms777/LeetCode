WITH T AS (
    SELECT O.sales_id
    FROM Orders O JOIN Company C USING (com_id)
    WHERE C.name = 'RED'
)
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (SELECT * FROM T);