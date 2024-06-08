package swiggy.model;

public class Menu {
    public String name;
    public double price;
    public boolean status;

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
