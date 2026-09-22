package model.user;

public class UserAccount {

    private long accountId;
    private String username;
    private String password;
    private String role;
    private boolean active;
    public UserAccount(long accountId, String username, String password,
                       String role, boolean active) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
    }
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }



    @Override
    public String toString() {
        return "UserAccount{" +
                "accountId=" + accountId +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", active=" + active +
                '}';
    }
}