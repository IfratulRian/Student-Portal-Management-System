package model;

public class Event {
    long eventId;
    String name;
    String type;
    /*WORKSHOP, SEMINAR, COMPETITION, CONTEST, CULTURAL*/
    String date;
    int maxParticipants;
    int registrationFee;
    String organizer;
    String participants;

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
