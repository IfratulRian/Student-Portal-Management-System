package model.event;

import model.user.Student;

import java.util.ArrayList;

public class Event {
    private long eventId;
    private String name;
    private String type;
    /*WORKSHOP, SEMINAR, COMPETITION, CONTEST, CULTURAL*/
    private String date;
    private int maxParticipants;
    private int registrationFee;
    private Club organizer;
    private ArrayList<Student> participants;

    public Event(long eventId, String name, String type, String date,
        int maxParticipants, int registrationFee, Club organizer,
                 ArrayList<Student> participants){

        this.eventId = eventId;
        this.name = name;
        this.type = type;
        this.date = date;
        this.maxParticipants = maxParticipants;
        this.registrationFee = registrationFee;
        this.organizer = organizer;
        this.participants = participants;
    }

    public long getEventId(){
        return eventId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public int getMaxParticipants(){
        return maxParticipants;
    }
    public void setMaxParticipants(int maxParticipants){
        this.maxParticipants = maxParticipants;
    }
    public int getRegistrationFee(){
        return registrationFee;
    }
    public void setRegistrationFee(int registrationFee){
        this.registrationFee = registrationFee;
    }
    public Club getOrganizer(){
        return organizer;
    }
    public void setOrganizer(Club organizer){
        this.organizer = organizer;
    }
    public ArrayList<Student>getParticipants(){
        return participants;
    }
    public void setParticipants(ArrayList<Student>participants){
        this.participants = participants;
    }
}
