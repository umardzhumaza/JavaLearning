package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfPredicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Пока");
        list.add("Ок");
        list.add("Учим Джава");
        list.add("А именно лямбда");
        //list.removeIf(element -> element.length() < 5);//Использовали готовый интерфейс Predicate
        Predicate<String> pr = element -> element.length() < 5; //Можно сохранить лямбду выражение в отдельную переменную Predicate.
        list.removeIf(pr);
        System.out.println(list);
    }
}
