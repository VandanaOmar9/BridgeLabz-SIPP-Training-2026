-- Use Case 17: Identify Countries Exceeding Case Threshold
USE covid_db;

SELECT country,
       MAX(confirmed_cases) AS maximum_confirmed_cases
FROM covid_cases
WHERE country IN (
    SELECT country
    FROM covid_cases
    GROUP BY country
    HAVING MAX(confirmed_cases) > 1000000
)
GROUP BY country
ORDER BY maximum_confirmed_cases DESC, country;
