package collections.arrayList;

import java.util.*;

public class hashAndEquals {
    public static void main(String[] args) {
        Map<Person,String> hashMap = new HashMap<>();
        Set<Person> hashSet = new HashSet<>();
        Person person1 = new Person(1,"Mike");
        Person person2 = new Person(1,"Mike");

        hashMap.put(person1,"Один");
        hashMap.put(person2,"Другое значение");

        hashSet.add(person1);
        hashSet.add(person2);
        System.out.println(hashMap);
        System.out.println(hashSet);

    }
}
class Person{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //медленный
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }
    //{object} -> {int} Приводит массив(объект)любой длины в определеную длину int
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    /*
    Контракт hashCode()  equals()
    1)У двух проверяемых объектов вызываем метод hashCode()
    если хэши разные -> два объекта точно разные.

    2)если хэши одинаковые -> equals(); возможно произошла коллизия или же объекты одинаковые

    3)equals() -> выдает уже точный ответ
     */
}
