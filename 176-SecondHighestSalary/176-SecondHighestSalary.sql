-- Last updated: 8/8/2025, 11:11:55 AM
select
(select distinct Salary 
from Employee order by salary desc 
limit 1 offset 1) 
as SecondHighestSalary;
