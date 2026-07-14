-- Use Case 1: Define Primary Keys in COVID Tables
USE covid_db;

CREATE TABLE covid_cases (
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    confirmed_cases BIGINT UNSIGNED NOT NULL,
    deaths BIGINT UNSIGNED NOT NULL DEFAULT 0,
    recoveries BIGINT UNSIGNED NOT NULL DEFAULT 0,
    last_updated TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (country, report_date)
);
