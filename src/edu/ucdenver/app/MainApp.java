package edu.ucdenver.app;
import edu.ucdenver.university.*;

import java.time.LocalDate;
import java.util.*;
import java.lang.*;


public class MainApp {

    public static void main(String[] args) throws Exception {
	University university = new University();

    System.out.println(">>>>>>>>>>>>>>>>>>>>>> UNIVERSITY Students Per Standing <<<<<<<<<<<<<<<<<<<<<<<<<<");
    for (Map.Entry<String, Integer> entry : university.countStudentsPerStanding().entrySet()) {
        String str = String.format("%-25s  %d", entry.getKey(), entry.getValue());

        System.out.println(str);
    }

    university.addPhD("Ellie miller", LocalDate.of(1999, 5, 20), "112233", "Forensics");
    university.addMaster("John Doe", LocalDate.of(1997,8,10), "112233");
    university.addCourse("MATh",1500, "Algebra");
    university.addUndergrad("John Smith", LocalDate.of(1999,5,20), "134633");
    university.addMaster("Jane Doe", LocalDate.of(1999,10,12), "1125373");
    university.addUndergrad("Dan Smith", LocalDate.of(2001,7,22), "246233");
    university.addMaster("Alice Doe", LocalDate.of(1998,9,11), "1168473");
    university.addMaster("ELi Doe", LocalDate.of(1997,8,10), "112233");
    university.addUndergrad("oajf  Smith", LocalDate.of(1999,5,20), "134633");
    university.addMaster("Kadjhn Doe", LocalDate.of(1999,10,12), "1125373");
    university.addUndergrad("zebra Smith", LocalDate.of(2001,7,22), "246233");
    university.addMaster("Zaedn Doe", LocalDate.of(1998,9,11), "1168473");

    university.addCourse("CSCI",3800, "NextGen CyberThreats and GAN");
    university.addUndergrad("Alice Smith", LocalDate.of(2000,6,21), "113573");
    university.addPhD("Javier Pastorino", LocalDate.of(1999,5,20), "11135763" , "Artificial Intelligence");
    university.addCourse("CSCI",3920, "Advanced Programming with Java and Python");

    System.out.println(">>>>>>>>>>>>>>>>>>>>>> UNIVERSITY <<<<<<<<<<<<<<<<<<<<<<<<<<");
    System.out.println(university);
    System.out.println();

    System.out.println(">>>>>>>>>>>>>>>>>>>>>> UNIVERSITY Students <<<<<<<<<<<<<<<<<<<<<<<<<<");
    for (Student s : university.getStudents()) {
        System.out.println(s);
    }
    System.out.println();

    System.out.println(">>>>>>>>>>>>>>>>>>>>>> UNIVERSITY Courses <<<<<<<<<<<<<<<<<<<<<<<<<<");
    for (Course c : university.getCourses()) {
        System.out.println(c);
    }
    System.out.println();

    System.out.println(">>>>>>>>>>>>>>>>>>>>>> UNIVERSITY Students sorted <<<<<<<<<<<<<<<<<<<<<<<<<<");

    university.sortStudents();
    for (Student s : university.getStudents()) {
        System.out.println(s);
    }
    System.out.println();



    System.out.println(">>>>>>>>>>>>>>>>>>>>>> UNIVERSITY Students Per Standing <<<<<<<<<<<<<<<<<<<<<<<<<<");
        Map<String,Integer> map1 = university.countStudentsPerStanding();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String str = String.format("%-25s  %d", entry.getKey(), entry.getValue());

            System.out.println(str);
        }

        //Stream.of(map.keySet().toString()).forEach(System.out::println);
    }
}
