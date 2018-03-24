CREATE OR REPLACE FUNCTION create_student()
RETURNS trigger AS
$$
DECLARE zmienna text; sql_command text; password_1 text;
BEGIN
zmienna = new.indexnumber; -- to string
zmienna = 's' || zmienna;
password_1 = '12345';
sql_command = ' CREATE ROLE ' || zmienna || ' WITH LOGIN PASSWORD ' || chr(39) || password_1 || chr(39) || ' ;';
-- chr(39) is '
EXECUTE sql_command ;
RETURN NEW;
END;
$$ LANGUAGE plpgsql;


