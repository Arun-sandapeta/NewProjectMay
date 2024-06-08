package swiggy.model;

import java.util.List;

public class Restaurant {
    public String name;
    public Address address;
    public Menu menu;

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", menu=" + menu +
                '}';
    }
}
