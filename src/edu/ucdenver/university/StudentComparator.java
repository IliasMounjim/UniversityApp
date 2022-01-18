package edu.ucdenver.university;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


    //@Override
    public int compare(Student a, Student b){
        if (a.getStanding() == b.getStanding()){
            return (a.getName().compareTo(b.getName()));
        }
        else if (a.getStandingInt() < b.getStandingInt())
            return -1;
        else
            return 1;




//        if (a.standing() < b.standing()) {
//            return -1;
//        } else if (a.standing() > b.standing()) {
//            return 1;
//        }
//        else {
//            if (a.getName().compareTo(b.getName()) < 0) {
//                return -1;
//            }
//            else if (a.getName().compareTo(b.getName()) > 0) {
//                return 1;
//            }
//        }
//    return 0;
    }
}
