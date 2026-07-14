CREATE DATABASE IF NOT EXISTS covid_assignment;
USE covid_assignment;

-- Countries Table
CREATE TABLE IF NOT EXISTS countries (
    country_id INT PRIMARY KEY,
    country_name VARCHAR(50),
    continent VARCHAR(50),
    population BIGINT
);

INSERT INTO countries VALUES
(1,'India','Asia',1380004385),
(2,'USA','North America',331000000),
(3,'Japan','Asia',126000000),
(4,'Germany','Europe',83000000),
(5,'Brazil','South America',212000000);

-- Covid Cases Table
CREATE TABLE IF NOT EXISTS covid_cases (
    case_id INT PRIMARY KEY,
    country_id INT,
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    FOREIGN KEY(country_id) REFERENCES countries(country_id)
);

INSERT INTO covid_cases VALUES
(101,1,'2021-01-01',100000,1500),
(102,2,'2021-01-01',200000,3000),
(103,3,'2021-01-01',50000,500),
(104,4,'2021-01-01',80000,1000),
(105,5,'2021-01-01',150000,2500);

-- Vaccines Table
CREATE TABLE IF NOT EXISTS covid_vaccines (
    vaccine_id INT PRIMARY KEY,
    country_id INT,
    vaccinated VARCHAR(10),
    FOREIGN KEY(country_id) REFERENCES countries(country_id)
);

INSERT INTO covid_vaccines VALUES
(1,1,'Yes'),
(2,2,'Yes'),
(3,4,'No');

