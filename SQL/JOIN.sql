CREATE DATABASE astha_db
USE jackI_db

DROP TABLE IF EXISTS course
CREATE TABLE course  
(
    c_id INT IDENTITY(1,1) PRIMARY KEY,
    course_name VARCHAR(30)
)

DROP TABLE IF EXISTS student
CREATE TABLE student
(
    st_id INT IDENTITY(1,1),
    student_name VARCHAR(30),
    course_id INT,
    FOREIGN KEY (course_id) REFERENCES course(c_id) ON DELETE CASCADE

)


INSERT INTO course
(
    course_name
)
VALUES
(
    'Business' 
),
(
    'Test'
),
(
    'Agile'
),
(
    'Web'
),
(
    'Dev'
)

INSERT INTO student
(
   student_name, course_id 
)
VALUES
(
    'Lee', 1
),
(
    'Barry', 1
),
(
    'David', 2
),
(
    'Tim',5
)


INSERT INTO student
(
   student_name
)
VALUES
(
    'Nicole'   
)

SELECT * FROM student
SELECT * FROM course

/*INNER JOIN-matched rows*/
--DOD-->JOIN SYNTAX-->1. Applying the join keyword based on the question
                -->2. Understanding which table to put in the left and which at the right
                -->3. Applying the ON keyword to define the primary key and foreign key relationship

 
SELECT * FROM student s INNER JOIN course c
ON s.course_id=c.c_id --ON defines primary key and foeign key relationship

SELECT * FROM student s, course c WHERE s.course_id=c.c_id; -- Old cartesian syntax

/*OUTER JOINS-LEFT JOIN, RIGHT JOIN, FULL JOIN*/
/*LEFT JOIN-All the rows from the left table and only the matching rows from the right table*/

SELECT * FROM student s LEFT JOIN course c   
ON s.course_id=c.c_id

SELECT * FROM student s RIGHT JOIN  course c
ON s.course_id=c.c_id

SELECT * FROM student s FULL JOIN course c   
ON s.course_id=c.c_id

USE Northwind;

SELECT * FROM Products

--inner joins
SELECT * 
FROM Orders o 
INNER JOIN [Order Details] od 
ON o.OrderID=od.OrderID
INNER JOIN products p 
ON od.ProductID=p.ProductID
INNER JOIN Categories c 
ON p.CategoryID=c.CategoryID;

SELECT * 
FROM Orders o, [Order Details] od, Products p, Categories c 
WHERE o.OrderID = od.OrderID AND od.ProductID = p.ProductID AND c.CategoryID = p.CategoryID;

--new way
SELECT p.SupplierID, s.CompanyName, AVG(p.UnitsOnOrder) AS "Average units on order" 
FROM Products p, Suppliers s 
WHERE p.SupplierID = s.SupplierID 
GROUP BY p.SupplierID, s.CompanyName;

--old way
SELECT p.SupplierID, s.CompanyName, AVG(p.UnitsOnOrder) AS "Average units on order" 
FROM Products p INNER JOIN Suppliers s ON p.SupplierID = s.SupplierID 
GROUP BY p.SupplierID, s.CompanyName;

--new way
SELECT p.ProductName, p.UnitPrice, s.CompanyName AS "Supplier", c.CategoryName AS "Category" 
FROM Products p 
INNER JOIN Suppliers s ON p.SupplierID = s.SupplierID
INNER JOIN Categories c ON p.CategoryID = c.CategoryID;

--old way
SELECT p.ProductName, p.UnitPrice, s.CompanyName AS "Supplier", c.CategoryName AS "Category" 
FROM Products p, Suppliers s, Categories c
WHERE p.SupplierID = s.SupplierID AND p.CategoryID = c.CategoryID;




SELECT o.OrderID, o.OrderDate, o.Freight, c.CompanyName, CONCAT(e.FirstName,' ',e.LastName) AS "Employee Name" 
FROM Orders o, Customers c, Employees e 
WHERE o.CustomerID = c.CustomerID AND e.EmployeeID = o.EmployeeID

SELECT o.OrderID, CONVERT(VARCHAR, o.OrderDate, 105), o.Freight, c.CompanyName, CONCAT(e.FirstName,' ',e.LastName) AS "Employee Name" 
FROM Orders o INNER JOIN Customers c ON o.CustomerID = c.CustomerID 
INNER JOIN Employees e on e.EmployeeID = o.EmployeeID


--SUBQUERIES

SELECT CompanyName AS "Customer" FROM Customers c WHERE c.CustomerID NOT IN (SELECT o.CustomerID FROM Orders o);

-- Using joins instead
SELECT CompanyName AS "Customer" FROM Customers c FULL JOIN Orders o ON o.CustomerID = c.CustomerID WHERE o.CustomerID IS NULL;


SELECT o.OrderID, o.ProductID, o.UnitPrice, o.Quantity, o.Discount, (SELECT MAX(od.UnitPrice) FROM [Order Details] od) AS "Max Price" 
FROM [Order Details] o;

SELECT od.ProductID, sq1.totalamt AS"Total sold for this product", od.UnitPrice, od.UnitPrice/sq1.totalamt*100 AS "% of Total" 
FROM [Order Details] od
INNER JOIN (SELECT od.ProductID, SUM(od.UnitPrice*od.Quantity) AS totalamt FROM [Order Details] od GROUP BY od.ProductID) sq1 
ON sq1.ProductID=od.ProductID;

SELECT od.OrderID, od.ProductID, od.UnitPrice, od.Quantity, od.Discount 
FROM [Order Details] od  
WHERE od.ProductID IN (SELECT p.ProductID FROM Products p WHERE p.Discontinued = 1);

SELECT od.OrderID, od.ProductID, od.UnitPrice, od.Quantity, od.Discount 
FROM [Order Details] od INNER JOIN Products p ON od.ProductID = p.ProductID 
WHERE p.Discontinued = 1;


---Matt's cursed solution
-- SELECT OrderID, od.ProductID, od.UnitPrice, Quantity, Discount
-- FROM [Order Details] od 
-- INNER JOIN
--     (SELECT * FROM Products
--     WHERE Discontinued = 1) p
-- ON od.ProductID = p.ProductID

--Unions

SELECT e.EmployeeID AS "Employee/Supplier" 
FROM Employees e 
UNION ALL
SELECT s.SupplierID
FROM Suppliers s;
















