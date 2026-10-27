# Write your MySQL query statement below
Select d.name As Department, e.name as Employee, e.Salary as Salary from Employee e join Department d on d.id=e.departmentId  WHERE (e.DepartmentId, e.Salary) IN (
    SELECT DepartmentId, MAX(Salary)
    FROM Employee
    GROUP BY DepartmentId
);