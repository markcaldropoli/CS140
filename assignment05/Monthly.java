package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MONTHS;

public class Monthly extends CalendarEntry {
	public Monthly(LocalTime startTime, LocalTime endTime, LocalDate date) {
		super(startTime, endTime, MONTHS);
		setDate(date);
	}
}
