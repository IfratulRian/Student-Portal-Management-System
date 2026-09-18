package model;

public class Certificate {
    private long certificateId;
    private Student student;
    private Event event;
    private String type;
    private String issueDate;

    public Certificate(long certificateId, Student student, Event event,
    String type, String issueDate){

        this.certificateId = certificateId;
        this.student = student;
        this.event = event;
        this.type = type;
        this.issueDate = issueDate;
    }
    public long getCertificateId(){
        return certificateId;
    }
    public void setCertificateId(long certificateId){
        this.certificateId = certificateId;
    }
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Event getEvent(){
        return event;
    }
    public void setEvent(Event event){
        this.event = event;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getIssueDate(){
        return issueDate;
    }
    public void setIssueDate(String issueDate){
        this.issueDate = issueDate;
    }
}
