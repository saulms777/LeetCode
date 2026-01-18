SELECT V.customer_id, COUNT(*) count_no_trans
FROM Visits V LEFT JOIN Transactions T USING (visit_id)
WHERE T.transaction_id IS NULL
GROUP BY customer_id;