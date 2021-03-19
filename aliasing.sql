USE Northwind;

--1.
SELECT COUNT(EmployeeID) AS "Employee Count" FROM Employees e WHERE e.City = 'London';
SELECT FirstName, LastName FROM Employees e WHERE e.City = 'London';

--2. 
SELECT FirstName + ' ' + LastName AS "Employee Name" FROM Employees e WHERE e.TitleOfCourtesy = 'Dr.';

--3
SELECT COUNT(ProductID) AS "Discontinued product count" FROM Products p  WHERE p.Discontinued = 1;
SELECT ProductName FROM Products p WHERE p.Discontinued = 1;

SELECT TOP 10 CompanyName, City FROM Customers c WHERE c.Country = 'France';
SELECT * FROM Customers c WHERE c.Country = 'France';

SELECT p.ProductName, p.UnitPrice FROM Products p WHERE p.CategoryID =1 AND p.Discontinued = 0;

SELECT p.ProductName, p.UnitPrice FROM Products p WHERE p.UnitsInStock > 0 AND p.UnitPrice>29.99;
SELECT p.ProductName, p.UnitPrice FROM Products p WHERE p.UnitsInStock > 0 OR p.UnitPrice>29.99;
SELECT DISTINCT Country FROM Customers WHERE ContactTitle = 'Owner';

SELECT * FROM Customers WHERE Region IN ('WA','SP');

SELECT * FROM Products;

--1.
SELECT p.ProductName, p.ProductID FROM Products p WHERE UnitPrice < 5;

--2. 
SELECT c.CategoryName FROM Categories c WHERE c.CategoryName LIKE '[B,S]%';

--3.
SELECT COUNT(*) AS "Total Orders" FROM Orders o WHERE o.EmployeeID IN(5,7) ;
---SELECT COUNT(*) AS "Total Orders" FROM Orders o WHERE o.EmployeeID IN(5,7) GROUP BY EmployeeID ;


SELECT * FROM Orders;


SELECT c.CompanyName AS "Company Name", c.City + ', ' + c.Country AS "City" FROM Customers c;


SELECT c.CompanyName AS "Company Name", CONCAT(c.City, ', ',  c.Country) AS "City" FROM Customers c;

SELECT CONCAT(e.FirstName, ' ', e.LastName) AS "Employee Name" FROM Employees e;


SELECT c.CompanyName AS "Company Name", c.City +', ' + c.Country AS "City" FROM Customers c WHERE c.Region IS NULL;

SELECT DISTINCT c.Country FROM Customers c WHERE c.Region IS NOT NULL;

SELECT o.UnitPrice, o.Quantity, o.Discount, o.UnitPrice*o.Quantity AS "Gross Total",  (o.UnitPrice*(1-o.Discount))*o.Quantity AS "Net Total"  FROM [Order Details] o;


SELECT o.UnitPrice, o.Quantity, o.Discount, o.UnitPrice*o.Quantity AS "Gross Total",  o.UnitPrice*o.Quantity*(1-o.Discount) AS "Net Total"  FROM [Order Details] o;

SELECT o.UnitPrice, o.Quantity, o.Discount, o.UnitPrice* o.Quantity AS "Gross Total" FROM [Order Details] o ORDER BY "Gross Total" DESC

SELECT TOP 2 o.OrderID, o.UnitPrice, o.Quantity, o.Discount, o.UnitPrice*o.Quantity AS "Gross Total",  (o.UnitPrice*(1-o.Discount))*o.Quantity AS "Net Total"  
FROM [Order Details] o 
ORDER BY "Net Total" DESC;

