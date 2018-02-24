package application.resources;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Faculty implements Serializable {
	private static final long serialVersionUID = 1030989201941101320L;

	private Integer ID;
	private String facultyName;
	//Set with leaders
	private Set leaders = new HashSet<Leader>();
	//Set with students
	private Set students = new HashSet<Student>();

	public Faculty(String facultyName) {
		super();
		this.facultyName = facultyName;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public Set getLeaders() {
		return leaders;
	}
	public void setLeaders(Set leaders) {
		this.leaders = leaders;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}

}
