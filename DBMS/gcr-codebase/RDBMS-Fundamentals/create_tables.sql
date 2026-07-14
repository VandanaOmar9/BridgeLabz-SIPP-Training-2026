USE covid_db;

CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(50),
    Report_Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Population BIGINT
);

CREATE TABLE covid_deaths (
    death_id INT AUTO_INCREMENT PRIMARY KEY,
    case_id INT,
    Country VARCHAR(50),
    Report_Date DATE,
    Deaths INT,
    FOREIGN KEY (case_id) REFERENCES covid_cases(id)
);

CREATE TABLE covid_vaccines (
    vaccine_id INT AUTO_INCREMENT PRIMARY KEY,
    case_id INT,
    Country VARCHAR(50),
    Report_Date DATE,
    Vaccination_Rate FLOAT,
    FOREIGN KEY (case_id) REFERENCES covid_cases(id)
);