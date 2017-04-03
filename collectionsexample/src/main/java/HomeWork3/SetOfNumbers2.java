package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOfNumbers2 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("input.txt");
        BufferedReader reader = new BufferedReader(in);
        List<String> lines = new ArrayList<>();
        Integer countOper = Integer.valueOf(reader.readLine());
        String line;
        for (int cnt = 1; cnt <= countOper; cnt++) {
            line = reader.readLine();
            lines.add(line);
        }
        String firstValue;
        String secondValue;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < countOper; i++) {
            firstValue = lines.get(i).length() == 1 ? lines.get(i) : lines.get(i).substring(0, lines.get(i).indexOf(" "));
            secondValue = lines.get(i).length() == 1 ? null : lines.get(i).substring(lines.get(i).indexOf(" ") + 1);
            if (firstValue.equals("1")) {
                numbers.add(Integer.valueOf(secondValue));
            }
            else {
                Collections.sort(numbers);
                System.out.println(numbers.get(0));
                numbers.remove(numbers.get(0));
            }
        }
    }
}
