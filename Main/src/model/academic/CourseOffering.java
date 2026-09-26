package model.academic;

public class CourseOffering {

    private long offeringId;
    private Course course;
    private Section section;
    private Batch batch;
    private String semester;

    public CourseOffering(long offeringId, Course course,
                          Section section, Batch batch,
                          String semester) {
        this.offeringId = offeringId;
        this.course = course;
        this.section = section;
        this.batch = batch;
        this.semester = semester;
    }

    public long getOfferingId() {
        return offeringId;
    }

    public void setOfferingId(long offeringId) {
        this.offeringId = offeringId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "offeringId=" + offeringId +
                ", course=" + course +
                ", section=" + section +
                ", batch=" + batch +
                ", semester='" + semester + '\'' +
                '}';
    }
}