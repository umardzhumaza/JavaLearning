package polymorph;



public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        test(animal1);
        test(dog1);
        test(cat1);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
