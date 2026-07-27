-- Use Case 23: Create Stored Procedure for Data Updates
USE covid_db;

DELIMITER //

CREATE PROCEDURE UpdateCovidStats(
    IN p_country VARCHAR(100),
    IN p_report_date DATE,
    IN p_confirmed_cases BIGINT,
    IN p_deaths BIGINT,
    IN p_recoveries BIGINT
)
BEGIN
    START TRANSACTION;

    UPDATE covid_cases
    SET confirmed_cases = p_confirmed_cases,
        deaths = p_deaths,
        recoveries = p_recoveries
    WHERE country = p_country
      AND report_date = p_report_date;

    COMMIT;
END //

DELIMITER ;
