package assignment05;

import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tester {

	public static void main(String[] args) {
		CalendarEntry cswed = new CalendarEntry(LocalTime.of(10,50),LocalTime.of(11,50),null);
		cswed.setDate(LocalDate.of(2017, 1, 18));
		cswed.setDescription("CS 140 class");
		cswed.setLocation("UU 108");
		System.out.println(cswed.toString());
		CalendarEntry csfri = cswed.copyTo(FRIDAY);
		System.out.println(csfri.toString());
		CalendarEntry csmon = cswed.copyTo(MONDAY);
		System.out.println(csmon.toString());
	}
}
