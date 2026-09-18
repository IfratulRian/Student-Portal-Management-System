package model;

public class Admin extends Person{
    private long adminId;
    private String role; //Designation.
    /* Like: SUPER_ADMIN, EVENT_MANAGER, CLUB_MANAGER*/

    public Admin(long id, String name, String email, String phone, long adminId, String role){
        super(id, name, email, phone);
        this.adminId = adminId;
        this.role = role;
    }

    public long getAdminId(){
        return adminId;
    }
    public void setAdminId(long adminId){
        this.adminId = adminId;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
}
