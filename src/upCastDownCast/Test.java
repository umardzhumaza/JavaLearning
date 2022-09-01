package upCastDownCast;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal2 = dog1; //Upcasting восходящее преобразование
        Animal animal1 = new Dog();  //Upcasting восходящее преобразование

        //Downcasting нисходящее преобразование
        Animal animal = new Animal();
        Dog dog2 = (Dog) animal;
        dog2.bark();  //ClassCastException

    }
}
