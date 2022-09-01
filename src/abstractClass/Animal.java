package abstractClass;

public abstract class Animal {
    public Animal(){}
    public Animal(int age, String name){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + " is eat");
    }
    public abstract void makeSound();
    public int age;
    public String name;

    @Override
    public String toString() {
        return "Age: " + age + " | Name: " + name;
    }
}
