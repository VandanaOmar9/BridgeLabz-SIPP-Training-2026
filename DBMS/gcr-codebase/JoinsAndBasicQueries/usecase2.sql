USE covid_assignment;

SELECT
    c.country_name,
    cc.deaths,
    cv.vaccinated
FROM covid_cases cc
LEFT JOIN covid_vaccines cv
ON cc.country_id=cv.country_id
INNER JOIN countries c
ON cc.country_id=c.country_id;