package model;

public class Event {
    private long eventId;
    private String name;
    private String type;
    /*WORKSHOP, SEMINAR, COMPETITION, CONTEST, CULTURAL*/
    private String date;
    private int maxParticipants;
    private int registrationFee;
    private String organizer;
    private String participants;

    public Event(long eventId, String name, String type, String date,
        int maxParticipants, int registrationFee, String organizer,
        String participants){

        this.eventId = eventId;
        this.name = name;
        this.type = type;
        this.date = date;
        this.maxParticipants = maxParticipants;
        this.registrationFee = registrationFee;
        this.organizer = organizer;
        this.participants = participants;
    }
}
