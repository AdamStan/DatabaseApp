CREATE TRIGGER create_student_trigger
  AFTER INSERT
  ON students
  FOR EACH ROW
  EXECUTE PROCEDURE create_student();
  
