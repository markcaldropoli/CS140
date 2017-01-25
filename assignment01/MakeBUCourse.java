package assignment01;

import java.time.LocalDate;
import java.time.LocalTime;

public class MakeBUCourse {

    public static void main(String[] args) {
        /*
         * BUCourse(int aSemester, int aCrn, String subj, String crs,
         * String sec,
            double cred, String title, LocalTime startTime,
            LocalTime endTime, String descr, String prereq, int cap,
            String instructor, LocalDate startDate, LocalDate endDate)
         */
        BUCourse crs1 = new BUCourse(
                201720, // THE FORMAT IS: Winter yyyy10, Spring yyyy20, Summer yyyy60, Fall yyyy90
                10385,
                "CS",
                "140", // not an int because of courses like 280C
                "A 0",
                4.00,
                "Programming with Objects",
                LocalTime.of(10, 50), // hour is from 0 to 23
                LocalTime.of(11, 50),
                "Assumes a foundation in procedural programming as covered "
                        + "in CS 100 or CS 110. Provides the foundations of "
                        + "software development using Java. Problem solving using "
                        + "object-oriented programming techniques is emphasized. "
                        + "Topics include primitive and reference data types, "
                        + "variables, expressions, assignment, functions/methods, "
                        + "parameters, selection, iteration, recursion, exception "
                        + "handling, generic linear data structures and maps, file "
                        + "types, file I/O, simple GUIs, programming to an "
                        + "interface and use of inheritance, javadoc documentation, "
                        + "introduction to Java threads. Required laboratory "
                        + "provides supervised problem solving, programming using "
                        + "the command line as well as Eclipse or Netbeans "
                        + "development environments, code backup in a version "
                        + "control repository, debugging and JUnit testing "
                        + "techniques.",
                        "CS 100 or CS 110",
                        72,
                        "Leslie C Lander",
                        LocalDate.of(2017, 1, 17),
                        LocalDate.of(2017, 5, 9)
                );
        
        BUCourse crs2 = new BUCourse(
        		201720,
        		10694,
        		"BIOL",
        		"117",
        		"A 0",
        		4.00,
        		"Organisms & Pops Bio",
        		LocalTime.of(8,30),
        		LocalTime.of(9, 55),
        		"Survey of organismal and population biology: structure and physiology"
        		+ " of organisms; diversity and relationships; ecology; animal behavior; and evolution.",
        		"High School Biology & Chemistry",
        		384,
        		"Michael A Armstrong",
        		LocalDate.of(2017, 1, 17),
        		LocalDate.of(2017, 5, 9)
        		);

        System.out.println(crs1.getSubj() + " " + crs1.getCrs() + " " + crs1.getTitle() + ", " + crs1.getStartTime() + "-" + crs1.getEndTime());
        System.out.println(crs2.getSubj() + " " + crs2.getCrs() + " " + crs2.getTitle() + ", " + crs2.getStartTime() + "-" + crs2.getEndTime());
    }
}
