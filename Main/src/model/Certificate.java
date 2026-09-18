package model;

public class Certificate {
    long certificateId;
    String student;
    String event;
    String type;
    String issueDate;

    public Certificate(long certificateId, String student, String event,
    String type, String issueDate){

        this.certificateId = certificateId;
        this.student = student;
        this.event = event;
        this.type = type;
        this.issueDate = issueDate;
    }
}
