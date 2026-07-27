-- Use Case 24: Implement Recovery Rate Function
USE covid_db;

DELIMITER //

CREATE FUNCTION CalculateRecoveryRate(p_country VARCHAR(100))
RETURNS DECIMAL(6,2)
READS SQL DATA
BEGIN
    DECLARE v_rate DECIMAL(6,2);

    SELECT ROUND((recoveries / NULLIF(confirmed_cases, 0)) * 100, 2)
    INTO v_rate
    FROM covid_cases
    WHERE country = p_country
    ORDER BY report_date DESC
    LIMIT 1;

    RETURN v_rate;
END //

DELIMITER ;
