package javaBeginer;

import org.jetbrains.annotations.NotNull;

public class Construct {
    public static void main(String[] args) {
       Human human1 = new Human("Тимофей",30);
       Human human2 = new Human("Василий",20);
       human1.printCountHuman();
       human2.printCountHuman();
    }
}
class Human{
    private static int countHuman;
    private static final String entity = "Прямоходящий";
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countHuman++;
    }
    public void printCountHuman(){
        System.out.println("Колличество людей для " + this.name + ": " + countHuman);
        System.out.println("Человек " + entity);
    }

    public void setName(@NotNull String name) {
        if(name.isEmpty()){
            System.out.println("Поле не может быть пустым");
        }else{
        this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    private String name;

    public void setAge(int age) {
        if (age < 0 && age > 110) {
            System.out.println("Ошибка ввода данных!");
        }else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    private int age;
}