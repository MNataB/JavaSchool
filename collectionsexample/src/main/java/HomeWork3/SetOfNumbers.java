package HomeWork3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sbt-manuilova-nb on 30.03.2017.
 */
public class SetOfNumbers {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("input.txt");
        List<String> lines = ReadFile.loadLines(in);
        List<Integer> numbers = new ArrayList<>();
        String firstValue;
        String secondValue;
        Integer countOper = Integer.valueOf(lines.get(0));

        for (int i = 1; i <= countOper; i++) {
            firstValue = lines.get(i).length() == 1 ? lines.get(i) : lines.get(i).substring(0, lines.get(i).indexOf(" "));
            secondValue = lines.get(i).length() == 1 ? null : lines.get(i).substring(lines.get(i).indexOf(" ") + 1);
            if (firstValue.equals("1")) {
                numbers.add(Integer.valueOf(secondValue));
                Collections.sort(numbers);
            }
            else {
                System.out.println(numbers.get(0));
                numbers.remove(numbers.get(0));
            }
        }
    }
}
