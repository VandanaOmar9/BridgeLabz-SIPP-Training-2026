-- Use Case 25: Create Audit Trigger for Data Changes
USE covid_db;

CREATE TABLE IF NOT EXISTS covid_cases_audit (
    audit_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    old_confirmed_cases BIGINT,
    new_confirmed_cases BIGINT,
    old_deaths BIGINT,
    new_deaths BIGINT,
    old_recoveries BIGINT,
    new_recoveries BIGINT,
    changed_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //

CREATE TRIGGER before_covid_cases_update
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO covid_cases_audit (
        country, report_date,
        old_confirmed_cases, new_confirmed_cases,
        old_deaths, new_deaths,
        old_recoveries, new_recoveries
    ) VALUES (
        OLD.country, OLD.report_date,
        OLD.confirmed_cases, NEW.confirmed_cases,
        OLD.deaths, NEW.deaths,
        OLD.recoveries, NEW.recoveries
    );
END //

DELIMITER ;
