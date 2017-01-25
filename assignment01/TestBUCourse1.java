package assignment01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestBUCourse1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BUCourse1 crs = null;
		int count1 = 0;
		int count2 = 0;
		try (FileInputStream inStream = new FileInputStream("courses.objs");) {
			ObjectInputStream objInStream = new ObjectInputStream(inStream);
			while(true) {
				crs = (BUCourse1)objInStream.readObject();	
				if(crs != null) {
					// System.out.println(crs.getCrs() + " " + crs.getTitle());
					if(crs.getCrs().charAt(0) == '1') {
						count1++;
					} else if(crs.getCrs().charAt(0) == '2') {
						count2++;
					}
				}
			}
		} catch(IOException ex) {
			// ex.printStackTrace();
			System.out.println("Number of 100-level courses = " + count1);
			System.out.println("Number of 200-level courses = " + count2);
		}
	}
}
