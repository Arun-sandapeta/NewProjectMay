package student.Service;

import student.model.Student;
import student.model.Subject;



public class StudentService {

    public static int minMarks = 35;

    public Student result(Student student) {

        for (Subject subject : student.subject) {
            if (subject.marks >= minMarks) {
                System.out.println( "is passed");
            } else {
                System.out.println( "FAILED");
            }
        }return student;

    }
}
