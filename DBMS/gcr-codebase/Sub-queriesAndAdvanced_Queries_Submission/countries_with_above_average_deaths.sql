-- Use Case 16: Find Countries with Above-Average Death Counts
USE covid_db;

SELECT country,
       deaths
FROM covid_deaths
WHERE deaths > (
    SELECT AVG(deaths)
    FROM covid_deaths
)
ORDER BY deaths DESC, country;
