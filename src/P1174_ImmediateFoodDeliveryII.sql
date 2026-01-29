SELECT
    ROUND(100 * SUM(IF(order_date = customer_pref_delivery_date, 1, 0)) / COUNT(*),
          2) immediate_percentage
FROM Delivery JOIN (
    SELECT customer_id, MIN(order_date) order_date
    FROM Delivery
    GROUP BY customer_id
) M USING (customer_id, order_date);