SELECT
    employee_id,
    E.department_id
FROM Employee E JOIN (
    SELECT employee_id, COUNT(*) dpts
    FROM Employee
    GROUP BY employee_id
) C USING (employee_id)
WHERE C.dpts = 1 OR E.primary_flag = 'Y';