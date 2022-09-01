package inheritance;

public class Dog extends Animals {
    @Override
    public void eat() {
        System.out.println("Собака ест!");
    }
    public void bark(){
        System.out.println("Гав-Гав!");
    }
    public void showName(){
        System.out.println(name = "Steve");
    }
}
