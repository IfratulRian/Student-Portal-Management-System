package model;

public class Club {
    private long clubId;
    private String name;
    private String description;
    private String president;
    private String members;
    private String events;

    public Club(long clubId, String name, String description,
        String president, String members, String events){

        this.clubId = clubId;
        this.name = name;
        this.description = description;
        this.president = president;
        this.members = members;
        this.events=events;
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
    public String getPresident(){
        return president;
    }
    public void setPresident(String president){
        this.president = president;
    }
    public String getMembers(){
        return members;
    }
    public void setMembers(String members){
        this.members = members;
    }
    public String getEvents(){
        return events;
    }
    public void setEvents(String events){
        this.events = events;
    }
}
