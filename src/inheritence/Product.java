package inheritence;


public class Product {
    private String brand;

    private double price;

    public Product (String brand, double price){
        this.brand=brand;
        this.price=price;

    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
    public String productDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        return "";

    }
}