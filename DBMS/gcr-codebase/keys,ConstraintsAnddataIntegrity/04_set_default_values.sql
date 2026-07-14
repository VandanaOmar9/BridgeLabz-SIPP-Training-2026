-- Use Case 4: Set Default Values
USE covid_db;

ALTER TABLE covid_cases
    MODIFY recoveries BIGINT UNSIGNED NOT NULL DEFAULT 0,
    MODIFY last_updated TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;
