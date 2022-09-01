package javaBeginer;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //Java 5<
        List<String> animal = new ArrayList<String>();
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Frog");

        String str2 = (String) animal.get(0);
        System.out.println(str2);
        //Java with generics update
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");

        for (String str:animals
             ) {
            System.out.println(str);
        }
        showInfo("String",14);
    }
    public static <T> void showInfo(T firstValue, T secondValue){
        System.out.println("Первое значение равно: " + firstValue + "\nВторое значение равно: " + secondValue);
    }
}
