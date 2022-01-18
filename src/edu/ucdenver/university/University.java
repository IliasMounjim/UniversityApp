package edu.ucdenver.university;

import java.time.LocalDate;
import java.util.*;
import java.lang.*;



public class University {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public University() {
        this.students = new ArrayList<>(100);
        this.courses = new ArrayList<>(100);
    }

    @Override
    public String toString() {
        return String.format("University  with %d students and %d courses.", this.getStudents().size(), this.getCourses().size());
    }

    public Student getStudent(String name) throws IllegalArgumentException{
        for (Student s: students){
            if (s.getName().equalsIgnoreCase(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student not in the university");
    }

    public Course getCourse(String subject, int number) throws IllegalArgumentException {
        for (Course c: courses){
            if (c.getSubject().equalsIgnoreCase(subject) && c.getNumber()==number) {
                return c;
            }
        }
        throw new IllegalArgumentException("Course not in Subjects.");
    }

    public void addUndergrad(String name, LocalDate dob, String id) {students.add(new Undergraduate(name, dob, id));}
    public void addMaster(String name, LocalDate dob, String id) {students.add(new Master(name, dob, id));}
    public void addPhD(String name, LocalDate dob, String id, String topic) {students.add(new PhD(name, dob, id, topic));}

    public void addCourse(String subject, int number, String title) throws IllegalArgumentException{
        try{
            this.getCourse(subject, number);
        }
        catch(IllegalArgumentException iae){
            this.courses.add(new Course(subject, number, title));
            return;
        }
        throw new IllegalArgumentException("The  course is already in the Subjects.");
    }

    public void sortStudents(){
        Collections.sort(this.students, new StudentComparator());
    }


    public Map<String,Integer> countStudentsPerStanding()  {

        //hrow new IllegalAccessError();
        Map<String,Integer> map = new HashMap<>();



        for (Student s : students)
            if (map.containsKey(s.getStanding())) {
                int count = map.get(s.getStanding());
                map.put(s.getStanding(), count +1);
            }
        else {
            map.put(s.getStanding(), 1);
            }
        return map;


//        int underGradCounter = 0;
//        int masterCounter = 0;
//        int phDCounter = 0;
//        for (Student s: students) {
//            if (s.getStandingInt() == 0) {
//                underGradCounter++;
//            } else if (s.getStandingInt() == 1) {
//                masterCounter++;
//            } else if (s.getStandingInt() == 2) {
//                phDCounter++;
//            }
//        }
//        // throw new IllegalAccessError();
//
//        if (underGradCounter !=0) {
//            map.put("Undergradute", underGradCounter);
//            //System.out.println("Undergraduate: \t"+ underGradCounter);
//        }
//        if (masterCounter !=0) {
//            map.put("Master", masterCounter);
//            //System.out.println("Master: \t\t"+ masterCounter);
//        }
//        if (phDCounter !=0) {
//            map.put("PhD", phDCounter);
//            //System.out.println("PhD: \t\t\t"+ phDCounter);
//        }

        //return map;
    }


    public Student getStudentbyID(String id) throws IllegalArgumentException{
        for (Student s: students){
            if (s.getId().equalsIgnoreCase(id)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student ID not in the university");
    }

    public void removeStudentById(String id) throws IllegalArgumentException {
        try {
            getStudentbyID(id);

        } catch (IllegalArgumentException ie) {
            System.out.println("ERROR:" + ie);
            return;
        }
        students.remove(getStudentbyID(id));
    }
    public void randomizeStudentList() {
        Collections.shuffle(students);
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

}
