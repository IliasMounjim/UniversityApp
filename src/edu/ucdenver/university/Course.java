package edu.ucdenver.university;

public class Course {

    private String subject;
    private int number;
    private String title;

    public Course(String subject, int number, String title) {
        this.subject = subject.toUpperCase();
        this.number = number;
        this.title = title;
    }

    public String toString() {
        return String.format("%s%04d - %s", this.subject, this.number, this.title);
    }


    public String getSubject() {
        return subject;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}
