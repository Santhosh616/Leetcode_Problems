-- Last updated: 7/30/2025, 9:20:47 AM
SELECT Employee.name, Bonus.bonus 
FROM Employee 
LEFT JOIN Bonus ON Employee.empID = Bonus.empID
WHERE Bonus.bonus < 1000 OR Bonus.bonus IS NULL;