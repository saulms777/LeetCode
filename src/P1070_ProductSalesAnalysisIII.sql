SELECT
    product_id,
    year first_year,
    quantity,
    price
FROM Sales S JOIN (
    SELECT product_id, MIN(year) year
    FROM Sales
    GROUP BY product_id
) M USING (product_id, year);