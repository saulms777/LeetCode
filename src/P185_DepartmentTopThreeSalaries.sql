WITH R AS (
    SELECT
        D.name d,
        E.name e,
        E.salary s,
        DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) r
    FROM Employee E JOIN Department D
        ON E.departmentId = D.id
)
SELECT
    d Department,
    e Employee,
    s Salary
FROM R
WHERE r <= 3;