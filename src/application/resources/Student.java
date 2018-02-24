package application.resources;

import java.util.HashSet;
import java.util.Set;

import application.resources.Faculty;

public class Student {

	private Integer indexNumber;
	private String name;
	private String surname;
	private Faculty faculty;
	//set with marks
	private Set marks = new HashSet<Mark>();

	public Student(Integer indexNumber, String name, String surname, Faculty faculty) {
		super();
		this.indexNumber = indexNumber;
		this.name = name;
		this.surname = surname;
		this.faculty = faculty;
	}
	public Student(Integer indexNumber, String name, String surname, String faculty) {
		super();
		this.indexNumber = indexNumber;
		this.name = name;
		this.surname = surname;
		this.faculty = new Faculty(faculty);
	}

	public Integer getIndexNumber() {
		return indexNumber;
	}
	public void setIndexNumber(Integer indexNumber) {
		this.indexNumber = indexNumber;
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
	public Set getMarks() {
		return marks;
	}
	public void setMarks(Set marks) {
		this.marks = marks;
	}
}
