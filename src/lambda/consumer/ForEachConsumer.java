package lambda.consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEachConsumer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Как дела?");
        list.add("Нормально");
        list.add("Пока!");
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("------------------");
        list.forEach(str -> System.out.println(str));//Использование consumer в ForEach

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el ->{
                System.out.println(el);
                el*=2;
                System.out.println(el);});

    }
}
