

public class Admin extends Person {

    private String adminRole; // e.g., "Registrar", "System Administrator"

    public Admin() {
        super();
    }

    public Admin(int id, String name, String email, String adminRole) {
        super(id, name, email);
        this.adminRole = adminRole;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public void display() {
        System.out.println("Admin Id: " + getId());
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
        System.out.println("Admin Role: " + adminRole);
    }
}