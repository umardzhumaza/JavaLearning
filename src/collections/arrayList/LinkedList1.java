package collections.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);//Быстрее добавлять в начало листа и удалять с середины листа элементы(узлы) головной узел ссылается на первый элемент -> {1} -> {2} -> {3} -> {4}
        measureTime(arrayList);//Быстрее добавлять в конец массива и считывать массив по индексу! [1][2][3][4][5]                                            ссылка
        arrayList.add(5);
        arrayList.get(0);
        arrayList.size();
        arrayList.remove(0);
        MyLinkedList mll = new MyLinkedList();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        mll.remove(0);
        System.out.println(mll);

    }
    private static void measureTime(List<Integer> list){


        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        long start1 = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            list.set(j,j+1);
        }
        long stop = System.currentTimeMillis();
        System.out.println(start1 - stop);
    }
}
