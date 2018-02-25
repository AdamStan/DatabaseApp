package application.resources;

public class Mark {
	private Integer ID;
	private Double value;
	private Subject subject;
	private Student student;

	public Mark(){ }
	public Mark(Double value) {
		super();
		this.value = value;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}


}
