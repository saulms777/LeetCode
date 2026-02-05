SELECT
    E.reports_to employee_id,
    M.name,
    COUNT(*) reports_count,
    ROUND(AVG(E.age)) average_age
FROM Employees E JOIN (
    SELECT employee_id, name
    FROM Employees
) M ON E.reports_to = M.employee_id
GROUP BY reports_to
ORDER BY employee_id;