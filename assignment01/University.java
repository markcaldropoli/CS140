package assignment01;

import java.io.Serializable;

public class University implements Serializable {
	private static final long serialVersionUID = -2906111453292851228L;
	private String name;
	private String city;
	
	public University(String school, String place) {
		this.name = school;
		this.city = place;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
}
