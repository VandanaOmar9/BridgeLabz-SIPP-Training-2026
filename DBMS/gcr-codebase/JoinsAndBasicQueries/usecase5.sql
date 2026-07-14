USE covid_assignment;

SELECT
    c.country_name,
    ROUND((cc.confirmed_cases*100.0)/c.population,4) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id=c.country_id
ORDER BY infection_rate DESC;