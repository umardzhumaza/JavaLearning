package abstractClass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog(15,"Шарик");
        cat.age = 10;
        cat.name = "Барсик";
        System.out.println(cat.toString());
        cat.makeSound();
        cat.eat();

        System.out.println(dog);
        dog.makeSound();
        dog.eat();

    }
}
