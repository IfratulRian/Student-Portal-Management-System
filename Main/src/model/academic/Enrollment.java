package model.academic;

import model.user.Student;

public class Enrollment {

    private long enrollmentId;
    private Student student;
    private CourseOffering courseOffering;
    private String enrollmentDate;
    private String status;

    public Enrollment(long enrollmentId, Student student,
                      CourseOffering courseOffering,
                      String enrollmentDate, String status) {

        this.enrollmentId = enrollmentId;
        this.student = student;
        this.courseOffering = courseOffering;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", student=" + student +
                ", courseOffering=" + courseOffering +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}