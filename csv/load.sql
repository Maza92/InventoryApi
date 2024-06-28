LOAD DATA INFILE "./suppliers.csv"
INTO TABLE gestion.supplier 
FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'  
IGNORE 1 LINES
(contact , company_name);
