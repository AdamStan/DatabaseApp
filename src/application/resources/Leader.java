package application.resources;

import application.resources.Faculty;

public class Leader {
	private Integer ID;
	private String name;
	private String surname;
	private Faculty faculty;

	public Leader() { }
	public Leader(String name, String surname, Faculty faculty) {
		super();
		this.name = name;
		this.surname = surname;
		this.faculty = faculty;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
