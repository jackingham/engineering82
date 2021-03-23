CREATE DATABASE jackI_db;

USE jackI_db;

--DROP TABLE film_table;
--DROP TABLE director_table;

CREATE TABLE film_table(
    film_id INT IDENTITY(1,1) PRIMARY KEY,
    film_name VARCHAR(10),
    film_type VARCHAR(10),
    release_date DATETIME,
    director_id INTEGER,
    writer VARCHAR(20),
    star INTEGER,
    film_language VARCHAR(10),
    website VARCHAR(30),
    plot_summary VARCHAR(500)
)

INSERT INTO film_table (
    film_name, 
    film_type, 
    release_date, 
    director_id, 
    writer, 
    star, 
    film_language, 
    website, 
    plot_summary)
VALUES ('Titanic',
 'Romance',
  '1997-11-01',
  '2', 
  'James Cameron', 
  '5', 
  'English', 
  'www.titanic.com', 
  'Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.'
  );

  SELECT * FROM film_table;

CREATE TABLE director_table(
    director_id INT IDENTITY(1,1) PRIMARY KEY,
    director_name VARCHAR(20),
    film_id INTEGER
)

INSERT INTO director_table (director_name, film_id) VALUES ('James Cameron', 1);


SELECT * FROM director_table;

SELECT * FROM film_table;


ALTER TABLE film_table 
  ADD CONSTRAINT fk_directorID 
  FOREIGN KEY (director_id) 
  REFERENCES director_table(director_id) 
  ON DELETE CASCADE;

EXEC sp_fkeys 'director_table'

DELETE FROM director_table WHERE director_id = 1;

--ALTER TABLE table_name ALTER COLUMN column_name [type] NOT NULL;
