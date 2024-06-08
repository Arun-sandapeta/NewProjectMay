package swiggy.service;

import swiggy.model.Address;
import swiggy.model.Menu;
import swiggy.model.Otp;
import swiggy.model.Restaurant;

public class SwiggyTest {

   public static void main(String[] args){

      Address address = new Address();
      address.flatNum="101";
      address.street="prashanth nagar";
      address.area="miyapur";
      address.city="hyderabad";
      address.pinCode=500049;

      Menu menu = new Menu();
      menu.name="biryani";
      menu.price=449;
      menu.status=true;


      Restaurant restaurant = new Restaurant();
      restaurant.name="KFC";
      restaurant.address=address;
      restaurant.menu=menu;




      SwiggyService swiggyService = new SwiggyService();
      Otp otp = swiggyService.registerRestaurant(restaurant);
      Otp inputotp = otp;



  Otp response =  swiggyService.validate(inputotp);
      System.out.println(response);

//   Restaurant REST = swiggyService.getRestaurant(restaurant);
       
   }

}
