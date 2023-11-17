public class User extends Person {
    private final boolean admin;

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }
    public boolean isAdmin() {
        return admin;
    }
}

