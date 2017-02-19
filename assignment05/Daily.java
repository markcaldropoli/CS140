package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.DAYS;

public class Daily extends CalendarEntry {
	private LocalDate endDate;
	
	public Daily(LocalTime startTime, LocalTime endTime, LocalDate date) {
		super(startTime, endTime, DAYS);
		if(date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		setDate(date);
	}
	
	public void setEndDate(LocalDate end) {
		endDate = end;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	@Override
	public boolean meetsOn(LocalDate aDate) {
		if(aDate.isBefore(getDate()) || (endDate != null && aDate.isAfter(getEndDate()))) {
			return false;
		} else {
			LocalDate temp = getDate();
			while(temp.isBefore(aDate) && !temp.isAfter(aDate) && !temp.equals(aDate)) {
				temp = temp.plusDays(1);
			}
			if(temp.equals(aDate)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
