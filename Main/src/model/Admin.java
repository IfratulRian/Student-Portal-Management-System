package model;

public class Admin extends Person{
    long adminId;
    String role; //Designation.
    /* Like: SUPER_ADMIN, EVENT_MANAGER, CLUB_MANAGER*/

    public Admin(long id, String name, String email, String phone, long adminId, String role){
        super(id, name, email, phone);
        this.adminId = adminId;
        this.role = role;
    }
}
