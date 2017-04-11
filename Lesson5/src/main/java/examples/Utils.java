package examples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Наталья on 06.04.2017.
 */
public class Utils {
        public static void printListCount (List<? super Integer> integers) {
            integers.add(new Integer(1));
            System.out.println(integers.size());
        }
}
