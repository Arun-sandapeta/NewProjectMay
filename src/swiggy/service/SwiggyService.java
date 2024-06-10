package swiggy.service;

import swiggy.model.Otp;
import swiggy.model.Restaurant;
import swiggy.model.User;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {

    public Otp otp;
    public Restaurant restaurantStaticVariable;

    public Otp registerRestaurant(Restaurant rrr){
        restaurantStaticVariable = rrr;
        OtpService otpService = new OtpService();
        return otpService.generateOtp(rrr.user);
    }
    String validate(Otp inputOtp, User user){
        OtpService otpService = new OtpService();
        return otpService.validate(inputOtp,user);

    }

}
