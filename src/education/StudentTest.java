package education;

import java.util.Date;

public class StudentTest {
    public static void main(String[] args){

        byte voter = (byte)255;
        System.out.println(voter);
        short voter1 = (short) 64000;
        System.out.println(voter1);
        int voter12 = (int) 984804611;
        System.out.println(voter12);


        String s1 = "Hello world";
        System.out.println(s1);




        Student arunstudent = new Student();
        arunstudent.name = "Arun";
        arunstudent.Dob = new Date(8-4-2000);
//        arunstudent.Standard = "x";
//        arunstudent.fatherName="Suresh";
//        arunstudent.mobileNumber="+919133724639";
//        arunstudent.street="Hafeezpet";
//        arunstudent.flatNo="202";
//        arunstudent.pinCode="500049";
//        arunstudent.city="Hyderabad";
        System.out.println("Arunstudent " + arunstudent.name);
        System.out.println("Schoolname " + arunstudent.schoolName);
        System.out.println("DOB " + arunstudent.Dob);


        Student rakeshstudent = new Student();
        rakeshstudent.name="Rakesh";
        arunstudent.name="Rakesh";

        System.out.println("rakeshstudent "+rakeshstudent.name);
        System.out.println("Schoolname " + rakeshstudent.schoolName);
        System.out.println("Arunstudent " + arunstudent.name);
        System.out.println("Schoolname " + arunstudent.schoolName);

    }
}
