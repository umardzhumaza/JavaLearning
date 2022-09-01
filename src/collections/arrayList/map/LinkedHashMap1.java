package collections.arrayList.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>(); //Внутри не гарантируется никакого порядка
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(); //В каком порядке пары-ключ были добавлены в таком они и вернутся
        Map<Integer,String> treeMap = new TreeMap<>();//Отсортированы по ключу(целый число от меньшего к большему)
        testMap(hashMap);
    }
    public static void testMap(Map<Integer,String> map){
        map.put(39,"Вася");
        map.put(14,"Гена");
        map.put(78,"Вова");
        map.put(99,"Коля");
        map.put(1005,"Катя");
        map.put(0,"Вася");
        for (Map.Entry<Integer,String> entry:map.entrySet()
             ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        };
    }
}
