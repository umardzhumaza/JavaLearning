package javaBeginer;

interface SomeInterface{
    public void eat();
}
public class AnonyousClass {
    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void eat() {
                System.out.println("Human is eating...");
            }
        };
        someInterface.eat();
        SomeInterface someInterface1 = new SomeInterface() {
            @Override
            public void eat() {
                System.out.println("Other human is eating..");
            }
        };
        someInterface1.eat();
    }
}
