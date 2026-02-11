SELECT Q1.person_name
FROM Queue Q1 JOIN Queue Q2
    ON Q2.turn <= Q1.turn
GROUP BY Q1.turn
HAVING SUM(Q2.weight) <= 1000
LIMIT 1;