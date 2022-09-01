package comparable;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Comparable1 {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElemets(peopleList);
        addElemets(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }
    public static void addElemets(Collection collection){
        collection.add(new Person(4,"Bob"));
        collection.add(new Person(2,"Mike"));
        collection.add(new Person(1,"Rob"));
        collection.add(new Person(3,"George"));
    }
}
class Person implements Comparable<Person>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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

    @Override
    public int compareTo(@NotNull Person o) {
        if(this.id > o.getId()){
            return 1;
        }else if(this.id < o.getId()){
            return -1;
        }else{
            return 0;
        }
    }
}
