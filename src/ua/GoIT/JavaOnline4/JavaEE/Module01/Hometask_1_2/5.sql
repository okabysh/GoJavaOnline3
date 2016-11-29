SELECT
	SUM(developer_customers_projects.term * developers.salary) AS Price_of_Customer,
	customers._descryption AS Customer
FROM developer_customers_projects
LEFT JOIN developers
ON developer_customers_projects.developer_ref = developers._id
LEFT JOIN customer_projects
ON developer_customers_projects.customer_project_ref = customer_projects._id
LEFT JOIN customers
ON customer_projects.customer_ref = customers._id

GROUP BY
	customers._descryption
ORDER BY
	Price_of_Customer
LIMIT 1	
