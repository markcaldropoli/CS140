package assignment01;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class BUCourse1 implements Serializable {
    private static final long serialVersionUID = 5517536495669938136L;
	private int semester;
	private int crn;
	private String subj;
	private String crs;
	private String sec;
	private double cred;
	private String title;
	//will return to "days" as an array in a later assignment
	private LocalTime startTime;
	private LocalTime endTime;
	
	private String descr;
	private String prereq;
	
	private int cap;
	private Instructor instructor;
	private InstrMeth method;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public BUCourse1(int aSemester, int aCrn, String subj, String crs, String sec, 
			double cred, String title, LocalTime startTime, LocalTime endTime, String descr,
			String prereq, int cap, Instructor anInstructor, InstrMeth aMethod, LocalDate startDate, LocalDate endDate) {
		this.semester = aSemester;
		this.crn = aCrn;
		this.subj = subj;
		this.crs = crs;
		this.sec = sec;
		this.cred = cred;
		this.title = title;
		this.startTime = startTime;
		this.endTime = endTime;
		this.descr = descr;
		this.prereq = prereq;
		this.cap = cap;
		this.instructor = anInstructor;
		this.method = aMethod;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public int getSemester() {
		return semester;
	}
	
	public int getCrn() {
		return crn;
	}
	
	public String getSubj() {
		return subj;
	}
	
	public String getCrs() {
		return crs;
	}
	
	public String getSec() {
		return sec;
	}
	
	public double getCred() {
		return cred;
	}
	
	public String getTitle() {
		return title;
	}
	
	public LocalTime getStartTime() {
		return startTime;
	}
	
	public LocalTime getEndTime() {
		return endTime;
	}
	
	public String getDescr() {
		return descr;
	}
	
	public String getPrereq() {
		return prereq;
	}
	
	public int getCap() {
		return cap;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public InstrMeth getMethod() {
		return method;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
}
