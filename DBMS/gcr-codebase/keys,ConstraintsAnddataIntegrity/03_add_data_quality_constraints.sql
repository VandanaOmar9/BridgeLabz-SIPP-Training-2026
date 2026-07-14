-- Use Case 3: Add Constraints to Ensure Data Quality
USE covid_db;

ALTER TABLE covid_cases
    MODIFY country VARCHAR(100) NOT NULL,
    MODIFY report_date DATE NOT NULL,
    MODIFY confirmed_cases BIGINT UNSIGNED NOT NULL,
    ADD CONSTRAINT chk_deaths_not_more_than_confirmed
        CHECK (deaths <= confirmed_cases);
