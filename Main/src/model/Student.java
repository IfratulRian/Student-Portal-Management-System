package model;

public class Student extends Person{
    private String department;
    private int semester;
    private double cgpa;
    private int points; //Credits

    public Student(long id, String name, String email, String phone,
        String department, int semester, double cgpa, int points){

        super(id, name, email, phone);
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
        this.points = points;
    }
}
