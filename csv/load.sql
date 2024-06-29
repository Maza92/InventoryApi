USE gestion;

SHOW VARIABLES LIKE 'secure_file_priv';


LOAD DATA INFILE "C:\ProgramData\MySQL\MySQL Server 8.4\Uploads\suppliers.csv"
INTO TABLE gestion.supplier 
FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'  
IGNORE 1 LINES
(contact , company_name);
