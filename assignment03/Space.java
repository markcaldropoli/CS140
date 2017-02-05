package assignment03;

public class Space {
	private String name;
	private double area;
	
	public Space(String n, double a) {
		this.name = n;
		this.area = a;
	}
	
	public String getName() {
		return name;
	}
	
	public double getArea() {
		return area;
	}
	
	public String toString() {
		return name+" of area "+area;
	}
}
