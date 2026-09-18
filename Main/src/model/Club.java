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
}
