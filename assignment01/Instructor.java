package assignment01;

import java.io.Serializable;

public class Instructor implements Serializable {
	private static final long serialVersionUID = -6606699573314198988L;
	private String name;
	private University univ;
	private InstructorCategory type;
	
	public Instructor(String professor, University university, InstructorCategory position) {
		this.name = professor;
		this.univ = university;
		this.type = position;
	}
	
	public String getName() {
		return name;
	}
	
	public University getUniv() {
		return univ;
	}
	
	public InstructorCategory getType() {
		return type;
	}
}
