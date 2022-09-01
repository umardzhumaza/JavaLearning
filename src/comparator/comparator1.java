package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        List<Person> person = new ArrayList<>();
        person.add(new Person(3,"Bob"));
        person.add(new Person(2,"Mike"));
        person.add(new Person(1,"Alex"));

        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                }else if(o1.getId() < o2.getId()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println(person);

        animals.add("Dogggggg");
        animals.add("Cat");
        animals.add("Frog");
        animals.add("Cow");

        Collections.sort(animals,new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(100);
        numbers.add(13);
        numbers.add(-3);
        Collections.sort(numbers, (o1, o2) -> {
            if(o1 > o2){
                return -1;
            }else if(o1 < o2){
                return 1;
            }else{
                return 0;
            }
        });
        System.out.println(numbers);
    }
}
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
          o1 > o2 =>1
          o1 < o2 =>-1
          o1 == o2 = 0
         */
        if (o1.length() > o2.length()){
            return 1;
        }else if(o1.length() < o2.length()){
            return -1;
        }else{
            return 0;
        }
    }
}
class Person{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Override
    public String   toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

