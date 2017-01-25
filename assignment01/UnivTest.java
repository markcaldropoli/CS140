package assignment01;

public class UnivTest {

	public static void main(String[] args) {
		University bing = new University("Binghamton University", "Binghamton");
		University yale = new University("Yale University", "Providence");
		
		System.out.println(bing.getName() + ", " + bing.getCity());
		System.out.println(yale.getName() + ", " + yale.getCity());
	}

}
