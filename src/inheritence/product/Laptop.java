package inheritence.product;

public class Laptop extends Product {
    private String processor;
    private String ram;

    public Laptop(String brand, double price, String processor, String ram){
        super(brand,price);
        this.processor=processor;
        this.ram=ram;

    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    public String laptopDetails(){
        System.out.println("processor: "+processor);
        System.out.println("RAM : "+ ram );
        return "";
    }
}


