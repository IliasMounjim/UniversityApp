package edu.ucdenver.university;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Student {
    private String name;
    private LocalDate dob;
    private String email;
    private String id;




    public Student(String name, LocalDate dob, String id){
        this.name = name;
        this.dob =dob;
        this.email = name.toLowerCase().replace(" ", ".")+"@ucdenver.edu";
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%-20s - %s - %-50s - Standing: %s", this.getName(), this.getDob(), this.getEmail(), this.getStanding());
    }

    public abstract String getStanding();
    public int getStandingInt() {
        return 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }
}
