package model;

public abstract class Person {
    private long id;
    private String name;
    private String email;
    private String phone;

    public Person(long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
