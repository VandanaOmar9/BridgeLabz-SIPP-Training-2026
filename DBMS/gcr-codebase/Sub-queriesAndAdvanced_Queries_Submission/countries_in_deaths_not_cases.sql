-- Use Case 20: Find Countries Present in Deaths but Not Cases
USE covid_db;

SELECT DISTINCT country
FROM covid_deaths
WHERE country NOT IN (
    SELECT country
    FROM covid_cases
    WHERE country IS NOT NULL
)
ORDER BY country;
