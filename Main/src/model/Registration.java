package model;

public class Registration {
    private long registrationId;
    private String student;
    private String event;
    private String regestrationDate;
    private String status;
    private double attendance;
    private int score;

    public Registration(long registrationId, String student, String event,
    String regestrationDate, String status, double attendance, int score){

        this.registrationId = registrationId;
        this.regestrationDate = regestrationDate;
        this.student = student;
        this.event = event;
        this.status = status;
        this.attendance = attendance;
        this.score = score;
    }
}
