package model.event;

import model.user.Student;

import java.util.ArrayList;

public class Club {
    private long clubId;
    private String name;
    private String description;
    private Student president;
    private ArrayList<Student> members;
    private ArrayList<Event> events;

    public Club(long clubId, String name, String description,
                Student president, ArrayList<Student> members,
                ArrayList<Event> events){

        this.clubId = clubId;
        this.name = name;
        this.description = description;
        this.president = president;
        this.members = members;
        this.events = events;
    }

    public long getClubId(){
        return clubId;
    }
    public void setClubId(long clubId){
        this.clubId = clubId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Student getPresident(){
        return president;
    }
    public void setPresident(Student president){
        this.president = president;
    }
    public ArrayList<Student> getMembers(){
        return members;
    }
    public void setMembers(ArrayList<Student> members){
        this.members = members;
    }
    public ArrayList<Event> getEvents(){
        return events;
    }
    public void setEvents(ArrayList<Event> events){
        this.events = events;
    }
}