package HomeWork3;

import java.util.*;

public class SetOfNumbers6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> values = new TreeMap<>();
        int count = Integer.valueOf(scanner.nextLine());
        String string;
        while (count-- >= 0) {
            string = scanner.nextLine();
            Integer val1 = Integer.valueOf(string.substring(0, string.indexOf(" ")));
            if (string.length() > 1) {
                Integer val2 = Integer.valueOf(string.substring(string.indexOf(" ") + 1));
                if (values.containsKey(val2))
                    values.put(val2, values.get(val2) + 1);
                else
                    values.put(val2, 1);
            } else {
                System.out.println(values.firstKey());
                if (values.firstEntry().getValue() > 1)
                    values.put(values.firstKey(), values.firstEntry().getValue() - 1);
                else
                    values.remove(values.firstEntry().getKey());
            }
        }
        scanner.close();
    }
}
