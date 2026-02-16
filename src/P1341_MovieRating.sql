WITH T AS (
    SELECT title, name, rating, created_at
    FROM MovieRating
        JOIN Movies USING (movie_id)
        JOIN Users USING (user_id)
)
(
    SELECT name results
    FROM T
    GROUP BY name
    ORDER BY COUNT(*) DESC, name
    LIMIT 1
)
UNION ALL
(
    SELECT title results
    FROM T
    WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY title
    ORDER BY AVG(rating) DESC, title
    LIMIT 1
);