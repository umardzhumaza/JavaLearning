package collections.arrayList.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterable1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Before Java 5
        int inx = 0;
        Iterator<Integer> iterator = list.iterator();//позволяет удалять во время итерирования
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            if(inx == 1){
                iterator.remove();
            }

            inx++;
        }
        //Java 5
        for (int i:list){//не можем удалить во время цикла(итерирования)
            System.out.println(i);
        }
    }
}
