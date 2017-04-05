package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOfNumber3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        List<Integer> numbers = new ArrayList<>();
        //Integer countOper = Integer.valueOf(reader.readLine());
        String string = reader.readLine();
        Integer minValue = 0;
        while ((string = reader.readLine()) != null) {
            if (string.length() > 1) {
                numbers.add(Integer.valueOf(string.substring(string.indexOf(" ") + 1)));
            }
            else {
                minValue = Collections.min(numbers);
                System.out.println(minValue);
                numbers.remove(minValue);
            }
        }
    }
}
