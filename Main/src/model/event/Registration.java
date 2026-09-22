package model.event;

import model.user.Student;

public class Registration {
    private long registrationId;
    private Student student;
    private Event event;
    private String registrationDate;
    private String status;
    private boolean attendance;
    private double score;

    public Registration(long registrationId, Student student, Event event,
       String registrationDate, String status, boolean attendance,
       double score){

        this.registrationId = registrationId;
        this.registrationDate = registrationDate;
        this.student = student;
        this.event = event;
        this.status = status;
        this.attendance = attendance;
        this.score = score;
    }

    public long getRegistrationId(){
        return registrationId;
    }
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Event getEvent(){
        return event;
    }
    public void setEvent(Event event){
        this.event = event;
    }
    public String getRegistrationDate(){
        return registrationDate;
    }
    public void setRegistrationDate(String registrationDate){
        this.registrationDate = registrationDate;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public boolean isAttendance(){
        return attendance;
    }
    public void setAttendance(boolean attendance){
        this.attendance = attendance;
    }
    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }
}
