package swiggy.service;

import swiggy.model.Otp;
import swiggy.model.User;

import java.util.Date;

public class OtpService {

    public User userInstance;
    public Otp otpInstance;

    public Otp generateOtp(User inputUser){
        userInstance = inputUser;
        Otp otp = new Otp();
        int randomNumber =(int) (Math.random()*9000)+1000;
        String number = String.valueOf(randomNumber);

        otp.otpNumber=number;
//        otp.otpNumber= UUID.randomUUID().toString();
        otp.creationTime=new Date();

        long currentTime = otp.creationTime.getTime();
        long endTime = currentTime+9000;

        otp.endTime=new Date(endTime);
        otpInstance = otp;
        return otp;

    }

    public String validate(Otp inputotp,User userInput){

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter otp ");
//        String enteredOtp = scanner.nextLine();
        if (inputotp.otpNumber.equals(inputotp.otpNumber)
        && userInput.mobile.equals(otpInstance.mobile)){
          return  "Registration successful";

        }else {
            return  "you have entered wrong otp, please try again";
        }


    }

}
