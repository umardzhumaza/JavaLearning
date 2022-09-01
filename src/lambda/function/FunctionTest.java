package lambda.function;

import lambda.function.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//public class StudentInfo {
//    void testStudents(List<Student> ls, StudentChecks sc) {
//        for (Student s : ls
//        ) {
//            if (sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }
//}
public class FunctionTest {
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
 //       StudentInfo info = new StudentInfo();
        double result = avgSmth(students, stud -> stud.avgGrade);
        System.out.println(result);
        double resultCoure = avgSmth(students, stud -> (double)stud.course);
        System.out.println(resultCoure);
        double resultAge = avgSmth(students, stud -> (double)stud.age);
        System.out.println(resultAge);
    }
    private static double avgSmth(List<Student> al, Function<Student, Double> f ){
        double result = 0;
        for(Student st: al){
            result += f.apply(st);
        }
        result = result / al.size();
        return result;
    }
}
