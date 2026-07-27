-- Use Case 21: Create View for Latest COVID Data
USE covid_db;

CREATE OR REPLACE VIEW latest_covid_data AS
SELECT c.country,
       c.report_date,
       c.confirmed_cases,
       c.deaths,
       c.recoveries
FROM covid_cases AS c
WHERE c.report_date = (
    SELECT MAX(latest.report_date)
    FROM covid_cases AS latest
    WHERE latest.country = c.country
);
