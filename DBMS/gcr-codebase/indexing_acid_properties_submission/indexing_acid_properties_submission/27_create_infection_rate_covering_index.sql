-- Use Case 27: Optimize Top 10 High Infection Rate Queries
USE covid_db;

CREATE INDEX idx_covid_cases_infection_rate_country
    ON covid_cases (infection_rate DESC, country);

-- Example query supported by the covering index:
SELECT country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;
