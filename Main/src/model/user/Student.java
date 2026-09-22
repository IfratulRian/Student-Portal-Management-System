package model;
import java.time.LocalDate;

public class Student extends Person {
    private String department;
    private int semester;
    private double cgpa;
    private int points;

    public Student(long id, String name, String email, String phone,
                   String address, LocalDate dateOfBirth,
                   String department, int semester, double cgpa, int points) {

        super(id, name, email, phone, address, dateOfBirth);

        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
        this.points = points;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}