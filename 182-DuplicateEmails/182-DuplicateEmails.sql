-- Last updated: 7/30/2025, 9:21:46 AM
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;
