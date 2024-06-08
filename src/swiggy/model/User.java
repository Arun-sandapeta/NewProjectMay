package swiggy.model;

public class User {
    public String name;
    public String mobile;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address=" + address +
                '}';
    }
}
