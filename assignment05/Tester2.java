package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tester2 {
	public static void main(String[] args) {
		ClassSchedule cs = new ClassSchedule();
		Weekly wed = new Weekly(LocalTime.of(10, 50),LocalTime.of(11, 50),LocalDate.of(2017, 1, 18));
		wed.setEndDate(LocalDate.of(2017, 5, 9));
		wed.setDescription("CS 140 class");
		wed.setLocation("UU 108");
		cs.addClassDay(wed);
		Weekly fri = new Weekly(LocalTime.of(10, 50),LocalTime.of(11, 50),LocalDate.of(2017, 1, 20));
		fri.setEndDate(LocalDate.of(2017, 5, 9));
		fri.setDescription("CS 140 class");
		fri.setLocation("UU 108");
		cs.addClassDay(fri);
		Weekly mon = new Weekly(LocalTime.of(10, 50),LocalTime.of(11, 50),LocalDate.of(2017, 1, 23));
		mon.setEndDate(LocalDate.of(2017, 5, 9));
		mon.setDescription("CS 140 class");
		mon.setLocation("UU 108");
		cs.addClassDay(mon);
		Weekly lab = new Weekly(LocalTime.of(10, 5),LocalTime.of(11, 30),LocalDate.of(2017, 1, 19));
		lab.setEndDate(LocalDate.of(2017, 5, 9));
		lab.setDescription("CS 140 lab");
		lab.setLocation("LNG 103");
		cs.addClassDay(lab);
		Daily winter = new Daily(LocalTime.of(0, 1),LocalTime.of(23, 59), LocalDate.of(2017, 3, 3));
		winter.setEndDate(LocalDate.of(2017, 3, 7));
		cs.addSkipDay(winter);
		Daily spring = new Daily(LocalTime.of(0, 1),LocalTime.of(23, 59), LocalDate.of(2017, 4, 8));
		spring.setEndDate(LocalDate.of(2017, 4, 17));
		cs.addSkipDay(spring);
		
		for(LocalDate d = LocalDate.of(2017, 1, 18); d.isBefore(LocalDate.of(2017, 5, 10));
				d = d.plusDays(1)) {
			if(cs.meetsOn(d)) {
				System.out.println(cs.getCopyForDay(d));
			}		
		}
	}
}
