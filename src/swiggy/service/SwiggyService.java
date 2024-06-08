package swiggy.service;

import swiggy.model.Otp;
import swiggy.model.Restaurant;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {

    public Otp otp;

    public Otp registerRestaurant(Restaurant restaurant){
        Otp otp = new Otp();
        int randomNumber =(int) (Math.random()*9000)+1000;
       String number = String.valueOf(randomNumber);

        otp.otpNumber=number;
//        otp.otpNumber= UUID.randomUUID().toString();
        otp.creationTime=new Date();

        long currentTime = otp.creationTime.getTime();
        long endTime = currentTime+9000;

        otp.endTime=new Date(endTime);
        this.otp = otp;
        return otp;
    }
    public Otp validate(Otp inputotp){
        Otp otp1 = new Otp();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter otp ");
//        String enteredOtp = scanner.nextLine();
        if (inputotp.otpNumber.equals(otp.otpNumber)){
            System.out.println("Registration successful");

        }else {
            System.out.println("you have entered wrong otp, please try again");
        }

        return otp1;
    }

    public Restaurant getRestaurant(Restaurant restaurant){
        Restaurant r = new Restaurant();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Restaurant name");
        String name = scanner.nextLine();
        if (restaurant.name.equals(name)){
            System.out.println("restaurant Details : " + restaurant);
        }else {
            System.out.println(" No details found");
        }
        return r;
    }
}
