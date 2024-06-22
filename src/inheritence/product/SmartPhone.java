package inheritence.product;

import inheritence.product.Laptop;

public class SmartPhone extends Laptop {
    private String cameraDetails;
    private String storage;

    public SmartPhone(String brand, double price, String processor, String ram, String cameraDetails, String storage){
        super(brand,price,processor,ram);
        this.cameraDetails=cameraDetails;
        this.storage=storage;
    }

    public String getCameraDetails() {
        return cameraDetails;
    }

    public void setCameraDetails(String cameraDetails) {
        this.cameraDetails = cameraDetails;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String smartPhoneDetails(){
        System.out.println("Camera Details : "+ cameraDetails);
        System.out.println("Storage : "+ storage);
        return "";

    }
}
