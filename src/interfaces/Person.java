package interfaces;

public class Person implements Info{
    public Person(String name) {
        this.name = name;
    }

    public String name;
    public void sayHello(){
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is: " + this.name);
    }
}
