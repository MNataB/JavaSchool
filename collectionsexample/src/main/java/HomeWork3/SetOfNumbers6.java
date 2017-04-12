package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sbt-manuilova-nb on 05.04.2017.
 * решение проверено на сайте, прошло все тесты
 */
public class SetOfNumbers6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Map<Integer, Integer> values = new TreeMap<>();
        String string = reader.readLine();
        int count = Integer.valueOf(string);
        while ((string = reader.readLine()) != null) {
            switch (Integer.valueOf(string.substring(0,1))) {
                case 1 :
                    Integer val = Integer.valueOf(string.substring(string.indexOf(" ") + 1));
                    if (values.containsKey(val))
                        values.put(val, values.get(val) + 1);
                    else
                        values.put(val, 1);
                    break;
                case 2 :
                    for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
                        System.out.println(entry.getKey());
                        if (entry.getValue() > 1)
                            values.put(entry.getKey(), entry.getValue() - 1);
                        else
                            values.remove(entry.getKey());
                        break;
                    }
            }
        }
    }
}
