USE covid_assignment;

SELECT
    c.continent,
    SUM(cc.deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id=c.country_id
GROUP BY c.continent;