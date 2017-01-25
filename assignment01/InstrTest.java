package assignment01;

public class InstrTest {
	
	public static void main(String[] args) {
		University bing = new University("Binghamton University", "Binghamton");
		Instructor lander = new Instructor("Leslie C Lander", bing, InstructorCategory.PROFESSOR);
		Instructor meng = new Instructor("Weiyi Meng", bing, InstructorCategory.PROFESSOR);
		
		System.out.println(lander.getName() + ", " + lander.getUniv().getName() + ", " + lander.getType());
		System.out.println(meng.getName() + ", " + meng.getUniv().getName() + ", " + meng.getType());
	}

}
