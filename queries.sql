--Part 1
--Job columns (data type)
--id (int)
--employer (String)
--name (String)
--skills (String)

--Part 2
--list the names of the employers in St. Louis City
SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT * FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;