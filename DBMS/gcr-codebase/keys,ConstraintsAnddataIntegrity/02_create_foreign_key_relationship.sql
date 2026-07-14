-- Use Case 2: Create Foreign Key Relationships
USE covid_db;

CREATE TABLE countries (
    country VARCHAR(100) NOT NULL PRIMARY KEY,
    continent VARCHAR(50) NOT NULL,
    population BIGINT UNSIGNED NOT NULL
);

ALTER TABLE covid_cases
    ADD CONSTRAINT fk_covid_cases_country
    FOREIGN KEY (country) REFERENCES countries(country);
