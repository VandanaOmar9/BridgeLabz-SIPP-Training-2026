-- Use Case 28: Analyze Query Execution Plans
USE covid_db;

EXPLAIN
SELECT c.country,
       c.report_date,
       c.confirmed_cases,
       d.deaths,
       v.vaccinated_people
FROM covid_cases AS c
INNER JOIN covid_deaths AS d
    ON d.country = c.country
   AND d.report_date = c.report_date
LEFT JOIN covid_vaccines AS v
    ON v.country = c.country
   AND v.report_date = c.report_date
WHERE c.report_date = '2020-03-16'
ORDER BY c.confirmed_cases DESC;

-- If EXPLAIN shows a full-table scan, add indexes on the JOIN keys:
-- CREATE INDEX idx_covid_deaths_country_report_date
--     ON covid_deaths (country, report_date);
-- CREATE INDEX idx_covid_vaccines_country_report_date
--     ON covid_vaccines (country, report_date);
