package inheritence;

public class Shopping {
    public static void main(String[] args) {
        Product product = new Product("Dell",75000);
       String p=  product.productDetails();

         Laptop laptop = new Laptop("Dell",75000,"intel processor","16gb ram");
      String l =   laptop.laptopDetails();

//         SmartPhone smartPhone = new SmartPhone("Samsung",50000,"Duel camera 200MP rare cam","256GB");
//        String s= smartPhone.smartPhoneDetails();

        System.out.println(l);



    }
}
