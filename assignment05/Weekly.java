package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.WEEKS;

import java.time.DayOfWeek;

public class Weekly extends CalendarEntry {
	private LocalDate endDate;
	
	public Weekly(LocalTime startTime, LocalTime endTime, LocalDate date) {
		super(startTime, endTime, WEEKS);
		setDate(date);
	}
	
	public void setEndDate(LocalDate end) {
		endDate = end;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	@Override
	public Weekly copyTo(DayOfWeek newDay) {
		Weekly temp = new Weekly(getStartTime(), getEndTime(), getDate());
		LocalDate tempDate = getDate();
		while(tempDate.getDayOfWeek() != newDay) {
			tempDate = tempDate.plus(1, DAYS);
		}
		System.out.println();
		temp.setDate(tempDate);
		temp.setEndDate(getEndDate());
		temp.setDescription(getDescription());
		temp.setLocation(getLocation());
		return temp;
	}
	
	@Override
	public boolean meetsOn(LocalDate aDate) {
		if(aDate.isBefore(getDate()) || (endDate != null && aDate.isAfter(getEndDate()))) {
			return false;
		} else {
			LocalDate temp = getDate();
			while(temp.isBefore(aDate) && !temp.isAfter(aDate) && !temp.equals(aDate)) {
				temp = temp.plusWeeks(1);
			}
			if(temp.equals(aDate)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public Weekly copy(LocalDate aDate) {
		Weekly temp = new Weekly(this.getStartTime(),this.getEndTime(),this.getDate());
		temp.setDate(aDate);
		temp.setDescription(getDescription());
		temp.setLocation(getLocation());
		return temp;
	}
}
