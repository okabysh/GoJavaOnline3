ALTER TABLE developer_customers_projects ADD Term integer;

UPDATE developer_customers_projects SET Term = 1 WHERE _ID=1;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=2;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=3;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=4;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=5;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=6;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=7;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=8;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=9;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=10;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=11;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=12;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=13;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=14;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=15;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=16;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=17;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=18;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=19;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=20;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=21;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=22;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=23;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=24;
UPDATE developer_customers_projects SET Term = 1 WHERE _ID=25;
 
 SELECT
	developers._descryption AS Developer,
	SUM(developer_customers_projects.term*developers.Salary) AS CostProject,
	projects._descryption AS Project
	FROM developer_customers_projects
LEFT JOIN customer_projects
	on developer_customers_projects.customer_project_ref = customer_projects._id
LEFT JOIN projects
	on customer_projects.project_ref = projects._id
LEFT JOIN developers
	on developer_customers_projects.developer_ref = developers._id

GROUP BY
	Developer,Project

ORDER BY
	CostProject DESC
LIMIT 1
