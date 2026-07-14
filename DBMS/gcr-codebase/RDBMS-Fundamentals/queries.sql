USE covid_db;

SELECT * FROM covid_cases;

SELECT * FROM covid_cases
WHERE Country = 'India';

SELECT * FROM covid_cases
ORDER BY Confirmed_Cases DESC;

SELECT Country, Deaths
FROM covid_cases;

SELECT AVG(Confirmed_Cases) AS Average_Cases
FROM covid_cases;