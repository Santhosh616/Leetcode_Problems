-- Last updated: 7/30/2025, 9:21:45 AM
SELECT name AS Customers FROM Customers WHERE Customers.id 
NOT IN (SELECT CustomerId FROM Orders);
