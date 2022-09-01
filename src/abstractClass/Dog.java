package abstractClass;

public class Dog extends Animal{
    public Dog(){}
    public Dog(int age, String name) {
        super(age, name);
    }

    public void makeSound(){
        System.out.println(name + " is barking...");
    }
}
