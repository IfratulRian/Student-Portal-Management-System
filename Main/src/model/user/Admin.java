package model.user;

import java.time.LocalDate;
public class Admin extends Person {
    private String role;
    public Admin(long id, String name, String email, String phone,
                 String address, LocalDate dateOfBirth, String role) {
        super(id, name, email, phone, address, dateOfBirth);
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "Admin{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", role='" + role + '\'' +
                '}';
    }
}