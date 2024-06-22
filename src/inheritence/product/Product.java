package inheritence.product;


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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String productDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        return "";

    }
}
