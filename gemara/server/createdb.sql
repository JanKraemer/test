## Usage: mysql -u root -p < createdb.sql
## or:    mysql -u root -p -h localhost < createdb.sql
## Delete this file after the database was created, because it contains the password!
CREATE DATABASE Test;
GRANT ALL ON Test.* TO root IDENTIFIED BY 'root';
FLUSH PRIVILEGES;
