package model;

public class Club {
    long clubId;
    String name;
    String description;
    String president;
    String members;
    String events;

    public Club(long clubId, String name, String description,
        String president, String members, String events){

        this.clubId = clubId;
        this.name = name;
        this.description = description;
        this.president = president;
        this.members = members;
        this.events=events;
    }
}
