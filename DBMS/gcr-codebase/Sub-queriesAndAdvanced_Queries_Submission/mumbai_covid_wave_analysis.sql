-- Use Case 18: Track COVID Waves - State-wise Analysis
USE covid_db;

SELECT outer_cases.state,
       outer_cases.report_date,
       outer_cases.confirmed_cases,
       CASE
           WHEN outer_cases.confirmed_cases = (
               SELECT MAX(inner_cases.confirmed_cases)
               FROM covid_cases AS inner_cases
               WHERE inner_cases.state = outer_cases.state
           ) THEN 'Peak day'
           ELSE 'Not a peak day'
       END AS wave_status
FROM covid_cases AS outer_cases
WHERE outer_cases.state = 'Mumbai'
ORDER BY outer_cases.report_date;
