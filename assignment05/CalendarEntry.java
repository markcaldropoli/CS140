package assignment05;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;

public class CalendarEntry {
	private LocalTime startTime;
	private LocalTime endTime;
	private LocalDate date;
	private ChronoUnit period;
	private DayOfWeek day;
	private String description;
	private String location;
	
	public CalendarEntry(LocalTime startTime, LocalTime endTime, ChronoUnit period) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.period = period;
	}
	
	public void setDate(LocalDate d) {
		date = d;
		day = date.getDayOfWeek();
	}
	
	public void setDescription(String descr) {
		description = descr;
	}
	
	public void setLocation(String loc) {
		location = loc;
	}
	
	public LocalTime getStartTime() {
		return startTime;
	}
	
	public LocalTime getEndTime() {
		return endTime;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public ChronoUnit getPeriod() {
		return period;
	}
	
	public DayOfWeek getDay() {
		return day;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getLocation() {
		return location;
	}
	
	/**
	 * Make a copy of this CalendarEntry but with the next later day given by the parameter.
	 * For example, if this.date is February 20, 2017,
	 * which is Monday, then copyTo(Friday) should give a CalendarEntry for February 24, 2017.
	 * @param newDay the day required of the new CalendarEntry
	 * @return a new CalendarEntry with the date moved so that day matches newDay
	 */
	public CalendarEntry copyTo(DayOfWeek newDay) {
		CalendarEntry temp = new CalendarEntry(startTime,endTime,period);
		LocalDate tempDate = date;
		while(tempDate.getDayOfWeek() != newDay) {
			tempDate = tempDate.plus(1, DAYS);
		}
		System.out.println();
		temp.setDate(tempDate);
		temp.setDescription(description);
		temp.setLocation(location);
		return temp;
	}
	
	public boolean meetsOn(LocalDate aDate) {
		return date.equals(aDate);
	}
	
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EE MMMM dd, yyyy");
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		return getDescription()+", "+getLocation()+", "+date.format(df)+" from "+startTime.format(tf)+" to "+endTime.format(tf);
	}
 }
