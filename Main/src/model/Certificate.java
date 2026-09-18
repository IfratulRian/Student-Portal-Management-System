package model;

public class Certificate {
    private long certificateId;
    private String student;
    private String event;
    private String type;
    private String issueDate;

    public Certificate(long certificateId, String student, String event,
    String type, String issueDate){

        this.certificateId = certificateId;
        this.student = student;
        this.event = event;
        this.type = type;
        this.issueDate = issueDate;
    }
}
