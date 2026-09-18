package model;

import javax.swing.*;

public class Student extends Person{
    long StudentId;
    String department;
    int semester;
    double cgpa;
    int points; //Credits

    public Student(long id, String name, String email, String phone, long adminId, String role){
        super(id, name, email, phone);
        this.StudentId = StudentId;
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
        this.points = points;
    }
}
