package Annotation.Advanced_Level.Implement_RoleBased_Access_Control_with_RoleAllowed;

public class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
