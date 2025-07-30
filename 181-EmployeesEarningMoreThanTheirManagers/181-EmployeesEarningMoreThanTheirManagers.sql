-- Last updated: 7/30/2025, 9:21:47 AM
SELECT e2.name as Employee
FROM employee e1 inner join
employee e2 on e1.id=e2.managerId
WHERE
e1.salary  < e2.salary