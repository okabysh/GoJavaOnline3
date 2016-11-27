CREATE TABLE COMPANIES(
_ID integer PRIMARY KEY NOT NULL,
_Descryption varchar(200) NOT NULL,
Identification_Code varchar(14),
Telephones varchar(70),
Address varchar(120),
Comment text
);

CREATE TABLE PROJECTS(
_ID integer PRIMARY KEY NOT NULL,
_Descryption varchar(200) NOT NULL,
Comment text
);

CREATE TABLE CUSTOMERS(
_ID integer PRIMARY KEY NOT NULL,
_Descryption varchar(200) NOT NULL,
Identification_Code varchar(14),
Telephones varchar(70),
Address varchar(120),
Comment text
);

CREATE TABLE SKILLS(
_ID integer PRIMARY KEY NOT NULL,
_Descryption varchar(200) NOT NULL,
Comment text
);


CREATE TABLE CUSTOMER_PROJECTS(
_ID integer PRIMARY KEY NOT NULL,
Customer_Ref integer references CUSTOMERS(_ID),
Project_Ref integer references PROJECTS(_ID), 
Comment text
);



CREATE TABLE DEVELOPERS(
_ID integer PRIMARY KEY NOT NULL,
_Descryption varchar(200) NOT NULL,
First_Name varchar(70),
Last_Name varchar(70),
Patronymic varchar(70),
Identification_Code varchar(10),
DateOfBirth date,
Telephones varchar(70),
Address varchar(120),
Company_Ref integer references COMPANIES(_ID),
Comment text
);

CREATE TABLE DEVELOPER_SKILLS(
_ID integer PRIMARY KEY NOT NULL,
Developer_Ref integer references DEVELOPERS(_ID),
Skill_Ref integer references SKILLS(_ID), 
Comment text
);

CREATE TABLE DEVELOPER_CUSTOMERS_PROJECTS(
_ID integer PRIMARY KEY NOT NULL,
Date_Start date,
Date_Deadline date,
Developer_Ref integer references DEVELOPERS(_ID),
Customer_Project_Ref integer references CUSTOMER_PROJECTS(_ID), 
Comment text
);
 
