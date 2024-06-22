package inheritence.product;

import inheritence.product.Laptop;
import inheritence.product.Product;

public class Shopping {
    public static void main(String[] args) {
        Product product = new Product("Dell",75000);
       String p=  product.productDetails();

         Laptop laptop = new Laptop(null,0,"intel processor","16gb ram");
      String l =   laptop.laptopDetails();

//         SmartPhone smartPhone = new SmartPhone(null,0,null,"16gb ram","Duel camera 200Mp rare cam","256GB");
//        String s= smartPhone.smartPhoneDetails();

        System.out.println(l);
    }
}
