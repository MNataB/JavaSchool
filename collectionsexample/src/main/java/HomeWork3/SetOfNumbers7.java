package HomeWork3;

import java.util.*;

public class SetOfNumbers7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> values = new TreeMap<>();
        int count = Integer.valueOf(scanner.nextLine());
        String string;
        while (count-- >= 0) {
            string = scanner.nextLine();
            switch (Integer.valueOf(string.substring(0,1))) {
                case 1 :
                    Integer val = Integer.valueOf(string.substring(string.indexOf(" ") + 1));
                    if (values.containsKey(val))
                        values.put(val, values.get(val) + 1);
                    else
                        values.put(val, 1);
                    break;
                case 2 :
                    System.out.println(values.firstKey());
                    if (values.firstEntry().getValue() > 1)
                        values.put(values.firstKey(), values.firstEntry().getValue() - 1);
                    else
                        values.remove(values.firstEntry().getKey());
                    break;
            }
        }
        scanner.close();
    }
}
