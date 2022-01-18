package edu.ucdenver.university;
import java.time.LocalDate;

public class PhD extends Graduate {
    private String dissertationTopic;

    public PhD(String name, LocalDate dob, String id, String dissertationTopic){
        super(name, dob, id);
        this.dissertationTopic = dissertationTopic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s - %s - %-50s - Standing: %s", this.getName(), this.getDob(), this.getEmail(), "PhD Student"));
        sb.append(String.format("PhD dissertation is about %s", this.dissertationTopic));
        return sb.toString();
    }

    @Override
    public String getStanding(){
        return "PhD";
    }
    public String getDissertationTopic() {
        return dissertationTopic;
    }

    @Override
    public int getStandingInt() {
        return 2;
    }

}
