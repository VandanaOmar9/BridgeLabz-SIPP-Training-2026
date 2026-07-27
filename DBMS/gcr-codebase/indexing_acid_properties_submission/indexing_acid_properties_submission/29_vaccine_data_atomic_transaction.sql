-- Use Case 29: Implement ACID Transaction for Vaccine Data
USE covid_db;

CREATE TABLE IF NOT EXISTS vaccine_distribution (
    distribution_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    doses_distributed BIGINT UNSIGNED NOT NULL,
    UNIQUE (country, report_date)
);

DELIMITER //

CREATE PROCEDURE InsertVaccineDataAtomically(
    IN p_country VARCHAR(100),
    IN p_report_date DATE,
    IN p_vaccinated_people BIGINT,
    IN p_doses_distributed BIGINT
)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        RESIGNAL;
    END;

    START TRANSACTION;

    INSERT INTO covid_vaccines (country, report_date, vaccinated_people)
    VALUES (p_country, p_report_date, p_vaccinated_people);

    INSERT INTO vaccine_distribution (country, report_date, doses_distributed)
    VALUES (p_country, p_report_date, p_doses_distributed);

    COMMIT;
END //

DELIMITER ;
