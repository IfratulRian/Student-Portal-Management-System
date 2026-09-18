package model;

public class Registration {
    long registrationId;
    String student;
    String event;
    String regestrationDate;
    String status;
    double attendance;
    int score;

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
