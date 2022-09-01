package collections.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(9));
        System.out.println(list.size());
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j));
        }
        list.remove(5);
        System.out.println();
        for (Integer i:list
             ) {
            System.out.print(i);
        }
        //нужно много удалать с середины листа то лучше использовать LinkedList
        list = new LinkedList<>();

    }
}
