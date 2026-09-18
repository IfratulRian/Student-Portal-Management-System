package model;

public class Admin extends Person{
    private String role; //Designation.
    /* Like: SUPER_ADMIN, EVENT_MANAGER, CLUB_MANAGER*/

    public Admin(long id, String name, String email, String phone, String role){
        super(id, name, email, phone);
        this.role = role;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
}
