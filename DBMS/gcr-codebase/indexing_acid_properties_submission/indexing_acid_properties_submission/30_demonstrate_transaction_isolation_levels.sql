-- Use Case 30: Demonstrate Isolation Levels
-- Run each labelled session in a separate MySQL connection.
USE covid_db;

-- Dirty reads: READ COMMITTED prevents one session from reading uncommitted changes.
-- Session A:
SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;
START TRANSACTION;
UPDATE covid_cases
SET confirmed_cases = confirmed_cases + 1
WHERE country = 'India' AND report_date = '2020-03-16';
-- Do not commit yet.

-- Session B:
-- SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;
-- START TRANSACTION;
-- SELECT confirmed_cases FROM covid_cases
-- WHERE country = 'India' AND report_date = '2020-03-16';
-- COMMIT;

ROLLBACK;

-- Non-repeatable reads: REPEATABLE READ returns the same row value in one transaction.
SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;
START TRANSACTION;
SELECT confirmed_cases
FROM covid_cases
WHERE country = 'India' AND report_date = '2020-03-16';
-- Run an UPDATE and COMMIT for this row in Session B, then repeat this SELECT.
SELECT confirmed_cases
FROM covid_cases
WHERE country = 'India' AND report_date = '2020-03-16';
COMMIT;

-- Phantom reads: SERIALIZABLE prevents new rows matching a range query.
SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;
START TRANSACTION;
SELECT *
FROM covid_cases
WHERE country = 'India'
  AND report_date BETWEEN '2020-03-01' AND '2020-03-31';
-- An INSERT of another matching row in Session B waits until this transaction commits.
COMMIT;
