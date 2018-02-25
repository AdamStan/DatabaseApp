package application.resources;

import java.util.HashSet;
import java.util.Set;

public class Subject {

	private Integer ID;
	private String nameOfSubject;
	//set with marks
	private Set marks = new HashSet<Mark>();
	private Leader leader;

	public Subject(){}
	public Subject(String nameOfSubject) {
		super();
		this.nameOfSubject = nameOfSubject;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}

	public Set getMarks() {
		return marks;
	}

	public void setMarks(Set marks) {
		this.marks = marks;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}


}
