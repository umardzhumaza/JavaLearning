package abstractClass;

public class Cat extends Animal{
    public Cat(){

    }
    public Cat(int age, String name) {
        super(age, name);
    }

    public void makeSound(){
        System.out.println(name + " is meowing...");
    }
}
