-- Use Case 5: Prevent Duplicate Country-Date Entries
USE covid_db;

ALTER TABLE covid_cases
    ADD CONSTRAINT uq_covid_cases_country_date
    UNIQUE (country, report_date);
