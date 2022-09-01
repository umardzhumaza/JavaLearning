package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class StudentInfo2 {
    void testStudents(List<Student> ls, Predicate<Student> pc) {
        for (Student s : ls
        ) {
            if (pc.test(s)) {
                System.out.println(s);
            }
        }
    }
}
public class PredicateTest {
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
        StudentInfo2 info = new StudentInfo2();


//        info.testStudents(students,p -> p.age<25);

        Predicate<Student> pc1 = student -> student.age <23;
        Predicate<Student> pc2 = student -> student.gender == 'F';

        info.testStudents(students, pc1.and(pc2));
        System.out.println("-----------------------");
        info.testStudents(students, pc1.or(pc2));
        System.out.println("-------------------------");
        info.testStudents(students, pc1.negate());


    }
}
