SELECT
	SUM(developer_customers_projects.term * developers.salary) AS Price_of_Project,
	projects._descryption AS Project
FROM developer_customers_projects
LEFT JOIN developers
ON developer_customers_projects.developer_ref = developers._id
LEFT JOIN customer_projects
ON developer_customers_projects.customer_project_ref = customer_projects._id
LEFT JOIN projects
ON customer_projects.project_ref = projects._id

GROUP BY
	projects._descryption
ORDER BY
	Price_of_Project
LIMIT 1﻿
