package model.user;

import java.time.LocalDate;

public class Teacher extends Person {

    private String teacherId;
    private String department;
    private String designation;

    public Teacher(long id, String name, String email, String phone,
                   String address, LocalDate dateOfBirth,
                   String teacherId, String department, String designation) {

        super(id, name, email, phone, address, dateOfBirth);

        this.teacherId = teacherId;
        this.department = department;
        this.designation = designation;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", teacherId='" + teacherId + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}