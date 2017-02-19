package assignment05;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClassSchedule {
	private ArrayList<Weekly> classDays = new ArrayList<>();
	private ArrayList<Daily> skipDays = new ArrayList<>();
	
	public void addClassDay(Weekly classDay) {
		classDays.add(classDay);
	}
	
	public void addSkipDay(Daily skipDay) {
		skipDays.add(skipDay);
	}
	
	public boolean meetsOn(LocalDate aDate){
		for(Weekly w : classDays) {
			if(w.meetsOn(aDate)) {
				for(Daily d : skipDays) {
					if(d.meetsOn(aDate)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public Weekly getCopyForDay(LocalDate aDate) {
		for(Weekly obj : classDays) {
			if(obj.meetsOn(aDate)) {
				return obj.copy(aDate);
			}
		}
		return null;
	}
}
