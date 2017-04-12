import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Наталья on 12.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map1 = new CountMapImpl<>();
        map1.add(10);
        map1.add(10);
        map1.add(5);
        map1.add(6);
        map1.add(5);
        map1.add(10);

        // метод getCount
        System.out.println("Количество добавлений числа 5: " + map1.getCount(5));
        System.out.println("Количество добавлений числа 6: " + map1.getCount(6));
        System.out.println("Количество добавлений числа 10: " + map1.getCount(10));

        // метод size
        System.out.println("Количество разных элементов: " + map1.size());

        // метод toMap
        System.out.println("-------------- метод toMap ---------------");
        for (Iterator it = map1.toMap().entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // метод toMap(destMap)
        Map<Integer,Integer> destMap = new HashMap<>();
        map1.toMap(destMap);
        System.out.println("---------- метод toMap(destMap) ----------");
        for (Iterator it = destMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // метод remove
        System.out.println("Количество элементов до удаления числа 10: " + map1.remove(10));
        System.out.println("Количество разных элементов: " + map1.size());

        // метод addAll
        CountMap<Integer> map2 = new CountMapImpl<>();
        map2.add(7);
        map2.add(8);
        map2.add(4);
        map2.add(5);
        map1.addAll(map2);

        System.out.println("-------------- метод addAll ---------------");
        for (Iterator it = map1.toMap().entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
