WITH O AS (
    SELECT product_id, SUM(unit) unit
    FROM Orders
    WHERE LEFT(order_date, 7) = '2020-02'
    GROUP BY product_id
    HAVING SUM(unit) >= 100
)
SELECT P.product_name, O.unit
FROM Products P JOIN O USING (product_id);