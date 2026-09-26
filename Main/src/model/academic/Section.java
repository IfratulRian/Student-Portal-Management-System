package model.academic;

public class Section {

    private long sectionId;
    private String sectionName;
    private String room;
    private String schedule;

    public Section(long sectionId, String sectionName,
                   String room, String schedule) {
        this.sectionId = sectionId;
        this.sectionName = sectionName;
        this.room = room;
        this.schedule = schedule;
    }

    public long getSectionId() {
        return sectionId;
    }

    public void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionId=" + sectionId +
                ", sectionName='" + sectionName + '\'' +
                ", room='" + room + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}