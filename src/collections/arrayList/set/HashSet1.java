package collections.arrayList.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        //Set хранит только уникальные значения,,игнорирует все дубликаты
        Set<String> hashSet = new HashSet<>();//Внутри не гарантируется никакого порядка
        Set<String> linkedHashSet = new LinkedHashSet<>();//В каком порядке были добавлены в таком они и вернутся
        Set<String> treeSet = new TreeSet<>();//Отсортированы по ключу(целый число от меньшего к большему)(строки - лексикографический порядок а<b<c)

        hashSet.add("Mike");
        hashSet.add("Max");
        hashSet.add("Tom");
        hashSet.add("Tom");//Проигнорирован
        hashSet.add("Alex");
        hashSet.add("Tom");//Проигнорирован
        hashSet.add("George");
        System.out.println(hashSet);


        System.out.println(hashSet.contains("Alex"));
        System.out.println(hashSet.isEmpty());
    }
}
