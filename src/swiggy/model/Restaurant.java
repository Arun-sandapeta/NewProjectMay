package swiggy.model;

import java.util.List;

public class Restaurant {
    public String name;
    public Address address;
    public Menu menu;

    public User user;

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", menu=" + menu +
                ", user=" + user +
                '}';
    }
}
