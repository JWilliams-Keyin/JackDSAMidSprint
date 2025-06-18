public class User {

    // Attributes

    public String userName;

    // Constructor

    public User(String userName) {
        this.userName = userName;
    }

    // Getters & Setters


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Methods

    public String toString() {
        return "Username: " + userName;
    }
}
