package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;

public class OneTime extends CalendarEntry {
	public OneTime(LocalTime startTime, LocalTime endTime, LocalDate date) {
		super(startTime, endTime, null);
		setDate(date);
	}
}
