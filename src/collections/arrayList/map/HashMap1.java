package collections.arrayList.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(); //Внутри не гарантируется никакого порядка
        map.put(1,"Один");
        map.put(2,"Два");
        map.put(3,"Три");
        System.out.println(map);
        map.put(3,"Четрые");
        System.out.println(map);
        System.out.println(map.get(10));
        for (Map.Entry<Integer,String> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
