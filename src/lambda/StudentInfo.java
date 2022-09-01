package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    void testStudents(List<Student> ls, StudentChecks sc){
        for (Student s: ls
             ) {
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }
    void printStudentOverGrade(List<Student> as,double grade){
        for (Student s:as
             ) {
            if(s.avgGrade>grade){
                System.out.println(s);
            }
        }
    }
    void printStudentUnderAge(List<Student> as,int age){
        for (Student s:as
        ) {
            if(s.age<age){
                System.out.println(s);
            }
        }

    }
    void printStudentMixCondition(List<Student> as,int age,double grade,char gender){
        for (Student s:as
        ) {
            if(s.age>age && s.avgGrade<grade && s.gender == gender){
                System.out.println(s);
            }
        }
    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'M',23,3,8.3 );
        Student st2 = new Student("Nikola",'M',28,2,6.4 );
        Student st3 = new Student("Elena",'F',19,1,8.9 );
        Student st4 = new Student("Petr",'M',35,4,7 );
        Student st5 = new Student("Maria",'F',23,3,9.1 );
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
        info.printStudentOverGrade(students,8);
        System.out.println("----------------------------------");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age<25;
            }
        });
        StudentChecks sc = (Student s) -> {return s.age<25;};//вынесли лямбду в отдельную переменную, можно использовать множество раз
        info.testStudents(students,sc);
        System.out.println("----------------------------------");
        info.testStudents(students,(Student s) -> {return s.age<25;});//разовое использование
        System.out.println("----------------------------------");
        info.testStudents(students, (Student s) -> {return  s.avgGrade>8;});
        System.out.println("----------------------------------");
        info.testStudents(students, s ->  s.avgGrade>8); //еще короче


    }
}
interface StudentChecks{
    boolean check(Student s);
}
