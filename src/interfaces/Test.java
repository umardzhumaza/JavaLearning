package interfaces;

public class Test {
    public static void main(String[] args) {
        Animals animal1 = new Animals(1);
        Person person1 = new Person("Alex");
        animal1.sleep();
        animal1.showInfo();
        person1.sayHello();
        person1.showInfo();
        outputInfo(animal1);

        Info info1 = new Animals(2);
        Info info2 = new Person("jim");
        info1.showInfo();
        info2.showInfo();
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
