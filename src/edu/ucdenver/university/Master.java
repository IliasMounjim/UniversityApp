package edu.ucdenver.university;

import java.time.LocalDate;

public class Master extends Graduate {

    public Master(String name, LocalDate dob, String id) {super (name, dob, id); }

    @Override
    public String getStanding(){
        return "Master";
    }

    @Override
    public int getStandingInt() {
        return 1;
    }
}