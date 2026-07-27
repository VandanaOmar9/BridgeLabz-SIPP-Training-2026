-- Use Case 26: Create Indexes on Frequently Searched Columns
USE covid_db;

CREATE INDEX idx_covid_cases_country_report_date
    ON covid_cases (country, report_date);

CREATE INDEX idx_covid_cases_report_date
    ON covid_cases (report_date);
