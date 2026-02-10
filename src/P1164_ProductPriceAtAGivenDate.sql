SELECT
    P.product_id,
    IF(D.date IS NULL, 10, new_price) price
FROM Products P JOIN (
    SELECT
        product_id,
        MAX(IF(change_date <= '2019-08-16', change_date, NULL)) date
    FROM Products
    GROUP BY product_id
) D ON P.product_id = D.product_id
    AND (P.change_date = D.date OR D.date IS NULL)
GROUP BY product_id;