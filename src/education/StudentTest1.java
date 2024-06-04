package education;

public class StudentTest1 {


    public static void main(String[] args){
        Student student = new Student();
        student.name="Arun";
        student.city="HYD";
        student.street="miyapur";


        Student ref1 = student;

        System.out.println(ref1);


        System.out.println(student.name);




    }

}
