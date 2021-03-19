SELECT * FROM products
/*STRING FUNCTIONS*/
DROP DATABASE IF EXISTS jackI_db
CREATE DATABASE jackI_db

USE jackI_db


DROP TABLE IF EXISTS film_table

CREATE TABLE film_table(
    film_id INT IDENTITY(1,1) PRIMARY KEY,
    film_name VARCHAR(50) NOT NULL,
    film_type VARCHAR(50)
)

INSERT INTO film_table VALUES
('    Star Wars', 'Sci fi'),
('Star Trek    ', 'Sci fi')

INSERT INTO film_table VALUES
('Batman', 'Action')


INSERT INTO film_table
(film_name) VALUES
('Superman')


SELECT * FROM film_table

--STRING FUNCTIONS--
SELECT film_name, CHARINDEX('s', film_name) AS "Position of Character" FROM film_table ;

SELECT film_name, SUBSTRING(film_name, 2, 3) AS "Extracted String" FROM film_table

SELECT film_name, RIGHT(film_name, 2) AS "Extracted String" FROM film_table

SELECT film_name, LEFT(film_name, 2) AS "Extracted String" FROM film_table

SELECT film_name, RTRIM(film_name) AS "Trimmed String" FROM film_table

SELECT film_name, LTRIM(film_name) AS "Trimmed String" FROM film_table

SELECT film_name, TRIM(film_name) AS "Trimmed String" FROM film_table

SELECT film_name, REPLACE(film_name,' ','A') AS "Replaced String" FROM film_table


SELECT film_name, LEN(film_name) AS "LENGTH of String" FROM film_table

SELECT film_name, UPPER(film_name) AS "Uppercase String", LOWER(film_name) AS "Lowercase String" FROM film_table;

USE Northwind;

SELECT c.PostalCode "Post Code", LEFT(c.PostalCode, CHARINDEX(' ',c.PostalCode)-1) AS "Post Code Region", CHARINDEX(' ',c.PostalCode) AS "Space Found", Country 
FROM Customers c 
WHERE c.Country = 'UK';

SELECT p.ProductName FROM Products p WHERE CHARINDEX('''', p.ProductName)!= 0; -- double '' to

SELECT CONVERT(VARCHAR, DATEADD(d,5,o.OrderDate), 105) AS "Due Date", DATEDIFF(d,o.OrderDate,o.ShippedDate) AS "Ship Days" FROM Orders o;

SELECT e.FirstName + ' ' + e.LastName AS "Name", DATEDIFF(d,e.BirthDate, GETDATE())/365.25 AS "AGE" FROM Employees e;

SELECT e.FirstName + ' ' + e.LastName AS "Name", DATEDIFF(YY , e.BirthDate, GETDATE())  AS "Age" FROM Employees e;

SELECT e.FirstName + ' ' + e.LastName AS "Name", CEILING(DATEDIFF(d,e.BirthDate, GETDATE())/365.25) AS "AGE" FROM Employees e

SELECT e.FirstName + ' ' + e.LastName AS "Name", FLOOR(DATEDIFF(d,e.BirthDate, GETDATE())/365.25) AS "AGE" FROM Employees e





SELECT CASE WHEN DATEDIFF(d,o.OrderDate,o.ShippedDate) < 10 THEN 'On time' ELSE 'Overdue' END AS "Status" FROM Orders o;


SELECT e.FirstName + ' ' + e.LastName AS "Name", FLOOR(DATEDIFF(d,e.BirthDate, GETDATE())/365.25) AS "AGE",  
CASE WHEN FLOOR(DATEDIFF(d,e.BirthDate, GETDATE())/365.25) > 65 THEN 'Retired' 
WHEN FLOOR(DATEDIFF(d,e.BirthDate, GETDATE())/365.25) > 60 THEN 'Retirement Due'
ELSE 'More than 5 years to go' END AS "Retirement Status"
FROM Employees e;























