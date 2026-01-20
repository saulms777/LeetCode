SELECT E.name
FROM Employee E JOIN (
    SELECT managerId, COUNT(*) amount
    FROM Employee
    GROUP BY managerId
) M ON E.id = M.managerId
WHERE amount >= 5;