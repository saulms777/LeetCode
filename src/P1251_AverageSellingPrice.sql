SELECT
    P.product_id,
    COALESCE(ROUND(SUM(P.price * U.units) / SUM(U.units), 2), 0) average_price
FROM Prices P LEFT JOIN UnitsSold U
    ON P.product_id = U.product_id
    AND U.purchase_date BETWEEN P.start_date AND P.end_Date
GROUP BY P.product_id;