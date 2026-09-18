package model;

public abstract class Person {
    long id;
    String name;
    String email;
    String phone;

    public Person(long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
