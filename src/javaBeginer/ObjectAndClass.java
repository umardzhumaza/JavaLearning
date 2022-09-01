package javaBeginer;

public class ObjectAndClass {
    public static void main(String[] args) {
        Person person1 = new Person("Umar",18);
        person1.speak();

        Person person2 = new Person("Raziya", 16);
        person2.speak();
        System.out.println(person2.toString());

    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        if (name.isEmpty()){
            System.out.println("Пустая строка!");
        }else
            this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age > 0 && age < 110){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    void speak(){
        System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет!");
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age;
    }
}
