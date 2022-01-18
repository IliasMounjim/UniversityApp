package edu.ucdenver.university;

import java.time.LocalDate;

public abstract class Graduate extends Student{


    public Graduate(String name, LocalDate dob, String id) {
        super(name, dob, id);
    }

//    @Override
//    public String getStanding(){
//        return "Graduate";
//    }
    @Override
    public int getStandingInt() {
        return 3;
    }
}
