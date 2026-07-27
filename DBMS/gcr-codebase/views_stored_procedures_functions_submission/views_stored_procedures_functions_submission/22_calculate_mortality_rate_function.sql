-- Use Case 22: Build Mortality Rate Function
USE covid_db;

DELIMITER //

CREATE FUNCTION CalculateMortalityRate(
    p_country VARCHAR(100),
    p_report_date DATE
)
RETURNS DECIMAL(6,2)
READS SQL DATA
BEGIN
    DECLARE v_rate DECIMAL(6,2);

    SELECT ROUND((deaths / NULLIF(confirmed_cases, 0)) * 100, 2)
    INTO v_rate
    FROM covid_cases
    WHERE country = p_country
      AND report_date = p_report_date;

    RETURN v_rate;
END //

DELIMITER ;
