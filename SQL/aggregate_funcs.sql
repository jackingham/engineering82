CREATE DATABASE jackI_db;

USE jackI_db;

USE Northwind;

SELECT p.SupplierID, 
SUM(p.UnitsOnOrder) AS "Total On Order", 
AVG(p.UnitsOnOrder) AS "Avg On Order", 
MIN(p.UnitsOnOrder) AS "Min on Order", 
MAX(p.UnitsOnOrder) AS "Max On Order" 
FROM Products p 
GROUP BY p.SupplierID;

1--
SELECT p.CategoryID, 
AVG(p.ReorderLevel) AS "Average re-order level" 
FROM Products p 
GROUP BY p.CategoryID 
ORDER BY "Average re-order level" DESC;

SELECT p.SupplierID, SUM(p.UnitsOnOrder) AS "Total On Order", 
AVG(p.UnitsOnOrder) AS "Avg on order" 
FROM Products p 
GROUP BY p.SupplierID 
HAVING AVG(p.UnitsOnOrder)>5 ; --NO aliases in having column



