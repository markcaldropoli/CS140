package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.DayOfWeek.*;

public class Tester1 {
	public static void main(String[] args) {
		Weekly test = new Weekly(LocalTime.of(10, 50),LocalTime.of(11, 50),LocalDate.of(2017, 1, 18));
		test.setEndDate(LocalDate.of(2017,5,9));
		test.setDescription("CS 140 class");
		test.setLocation("UU 108");
		for(LocalDate d = test.getDate(); d.isBefore(LocalDate.of(2017, 5, 10)); d = d.plusDays(1)) {
			//Spring Break April 12th
			if(test.meetsOn(d) && !d.equals(LocalDate.of(2017, 4, 12))) {
				System.out.println(test.copy(d));
			}
		}
		
		System.out.println();
		
		Weekly test1 = new Weekly(LocalTime.of(10, 50), LocalTime.of(11, 50), LocalDate.of(2017, 1, 18));
		test1.setEndDate(LocalDate.of(2017, 5, 9));
		test1.setDescription("CS 140 Class");
		test1.setLocation("UU 108");
		System.out.println(test1);
		
		Weekly test2 = test1.copyTo(FRIDAY);
		System.out.println(test2);
	}
}
