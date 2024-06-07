package swiggy.service;

import swiggy.model.Otp;
import swiggy.model.Restaurant;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {

    public Otp registerRestaurant(Restaurant restaurant){
        Otp otp = new Otp();
        int randomNumber =(int) (Math.random()*9000)+1000;
       String number = String.valueOf(randomNumber);

        otp.otpNumber=number;
//        otp.otpNumber= UUID.randomUUID().toString();
        otp.creationTime=new Date();

        long currentTime = otp.creationTime.getTime();
        long endTime = currentTime+900000;

        otp.endTime=new Date(endTime);


        return otp;
    }
    public void validate(Otp otp){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter otp ");
        String enteredOtp = scanner.nextLine();
        if (otp.otpNumber.equals(enteredOtp)){
            System.out.println("Registration successful");

        }else {
            System.out.println("you have entered wrong otp, please try again");
        }

    }
}
