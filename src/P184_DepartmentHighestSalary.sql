WITH
    Employees AS (
        SELECT
            Department.name AS Department,
            Employee.name AS Employee,
            Employee.salary AS Salary
        FROM Employee JOIN Department
            ON Employee.departmentId = Department.id
    ),
    MaxSalaries AS (
        SELECT Department, MAX(Salary) AS MaxSalary
        FROM Employees
        GROUP BY Department
    )
SELECT *
FROM Employees
WHERE Salary = (SELECT MaxSalary
                FROM MaxSalaries
                WHERE Employees.Department = MaxSalaries.Department);