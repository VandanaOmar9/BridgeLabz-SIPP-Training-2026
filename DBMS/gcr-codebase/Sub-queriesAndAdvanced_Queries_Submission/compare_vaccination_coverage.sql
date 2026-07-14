-- Use Case 19: Compare Vaccination Coverage
USE covid_db;

SELECT co.country,
       'Vaccinated' AS coverage_type,
       COALESCE(v.vaccinated_people, 0) AS population_count
FROM countries AS co
LEFT JOIN covid_vaccines AS v
    ON v.country = co.country

UNION

SELECT co.country,
       'Unvaccinated' AS coverage_type,
       GREATEST(co.population - COALESCE(v.vaccinated_people, 0), 0) AS population_count
FROM countries AS co
LEFT JOIN covid_vaccines AS v
    ON v.country = co.country

ORDER BY country, coverage_type;
