package collections.arrayList.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedList1 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        Queue<Person> people = new ArrayBlockingQueue<Person>(10);
        people.add(person3);//метод offer точно такой же но не выкинет исключение,а вернет какое то значение
        people.add(person2);
        people.add(person4);
        people.add(person1);
        people.remove();//метод pool точно такой же,но не выкинет исключение,а тихо вернет какое то значение
        System.out.println(people.peek());//метод element выкинет исключение
        for (Person person:people
             ) {
            System.out.println(person);
        }
    }
}
class Person{
    private int id;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public Person(int id) {
        this.id = id;
    }
}
