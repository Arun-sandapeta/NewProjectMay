package student.Service;

import student.model.Student;
import student.model.Subject;

public class StudentTest {
    public static void main(String[] args){

        Subject subject =new Subject();
        subject.subName="Telugu";
        subject.marks=50;

        Subject subject1 = new Subject();
        subject1.subName="English";
        subject1.marks=36;

        Subject subject2 = new Subject();
        subject2.subName="Maths";
        subject2.marks=29;

        Subject subject3 = new Subject();
        subject3.subName="physics";
        subject3.marks=30;

        Subject[] subjects = new Subject[4];
        subjects[0]=subject;
        subjects[1]=subject1;
        subjects[2]=subject2;
        subjects[3]=subject3;

        Student student = new Student();
        student.studentName="Arun";
        student.rollNumber="1";
        student.Standard="VI";
        student.subject=subjects;

        Subject subject4 =new Subject();
        subject4.subName="Telugu";
        subject4.marks=50;

        Subject subject5 = new Subject();
        subject5.subName="English";
        subject5.marks=36;

        Subject subject6 = new Subject();
        subject6.subName="Maths";
        subject6.marks=44;

        Subject subject7 = new Subject();
        subject7.subName="physics";
        subject7.marks=50;

        Subject[] subjects1 = new Subject[4];
        subjects1[0]=subject4;
        subjects1[1]=subject5;
        subjects1[2]=subject6;
        subjects1[3]=subject7;

        Student saistudent = new Student();
        saistudent.studentName="sai";
        saistudent.rollNumber="2";
        saistudent.Standard="VI";
        saistudent.subject=subjects1;

        StudentService service = new StudentService();
        service.result(student);
        service.result(saistudent);
    }
}
