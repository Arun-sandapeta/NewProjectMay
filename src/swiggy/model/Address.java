package swiggy.model;

public class Address {

    public String street;
    public String area;
    public String flatNum;
    public int pinCode;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", flatNum='" + flatNum + '\'' +
                ", pinCode=" + pinCode +
                ", city='" + city + '\'' +
                '}';
    }
}
