package bank;

public class User {
    public String name;
    public String password;

    public boolean isLocked;
    public int NumOfAttempts;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isLocked=" + isLocked +
                ", NumOfAttempts=" + NumOfAttempts +
                '}';
    }
}
