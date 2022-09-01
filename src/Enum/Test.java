package Enum;

import java.util.Arrays;

//Enumeration
//Object -> Enum -> Season
public class Test {
    public static void main(String[] args) {
        EnumWithMethod enumWithMethod = EnumWithMethod.DIVIDE;
        System.out.println(enumWithMethod.action(1, 0));//Divide by zero exception
        Animal animal = Animal.BEAR;
        Season season = Season.SPRING;
        Season[] seasons = season.values();//Array of Enum
        System.out.println(Arrays.toString(seasons));
        System.out.println(season + " " + season.getTemperature());
        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            case BEAR:
                System.out.println("It's a bear");
                break;
            default:
                System.out.println("It's not an animal!");
        }
    }
}
