package Family;

import java.util.Arrays;

public class Family {


    public String name;

    public long aadhaar;

    public Address address;

    public Family[] family;

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", aadhaar=" + aadhaar +
                ", address=" + address +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
