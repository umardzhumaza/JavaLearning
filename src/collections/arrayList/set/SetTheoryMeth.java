package collections.arrayList.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTheoryMeth {
    public static void main(String[] args) {
        //Set хранит только уникальные значения,,игнорирует все дубликаты
        Set<Integer> hashSet = new HashSet<>();//Внутри не гарантируется никакого порядка
        Set<String> linkedHashSet = new LinkedHashSet<>();//В каком порядке пары-ключ были добавлены в таком они и вернутся
        Set<String> treeSet = new TreeSet<>();//Отсортированы по ключу(целый число от меньшего к большему)(строки - лексикографический порядок а<b<c)
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        ////////////////
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);
        hashSet2.add(8);
        //union - объединение множеств
        Set<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println(union);
        //intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet2);
        System.out.println(intersection);
        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet);
        difference.removeAll(hashSet2);
        System.out.println(difference);
    }
}
