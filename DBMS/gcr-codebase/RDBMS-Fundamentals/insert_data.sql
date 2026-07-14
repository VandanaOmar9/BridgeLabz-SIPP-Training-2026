USE covid_db;

INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES
('India', '2020-03-15', 100, 2, 50, 1380004385);

UPDATE covid_cases
SET Confirmed_Cases = 120
WHERE Country = 'India'
AND Report_Date = '2020-03-15';

DELETE FROM covid_cases
WHERE Country = 'IN';

ALTER TABLE covid_cases
ADD vaccination_rate FLOAT;

UPDATE covid_cases
SET vaccination_rate = 76.5
WHERE Country = 'India';