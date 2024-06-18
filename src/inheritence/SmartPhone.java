package inheritence;

public class SmartPhone extends Product{
    private String cameraDetails;
    private String storage;

    public SmartPhone(String brand, double price, String cameraDetails, String storage){
        super(brand,price);
        this.cameraDetails=cameraDetails;
        this.storage=storage;
    }

    public String getCameraDetails() {
        return cameraDetails;
    }

    public String getStorage() {
        return storage;
    }
    public String smartPhoneDetails(){
        System.out.println("Camera Details : "+ cameraDetails);
        System.out.println("Storage : "+ storage);
        return "";

    }
}
