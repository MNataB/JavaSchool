package HomeWork3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReadFile2 {
    static List<String> loadLines(FileReader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty())
                continue;
            lines.add(line);
        }
        reader.close();
        return lines;
    }
}

public class SetOfNumbers {
    public static void main(String[] args) throws IOException {
        FileWriter out = new FileWriter("output.txt");
        FileReader in = new FileReader("input.txt");
        List<String> lines = ReadFile2.loadLines(in);
        List<Integer> numbers = new ArrayList<>();
        String firstValue;
        String secondValue;
        Integer countOper = Integer.valueOf(lines.get(0));
        String lineSeparator = System.getProperty("line.separator");

        for (int i = 1; i <= countOper; i++) {
            firstValue = lines.get(i).length() == 1 ? lines.get(i) : lines.get(i).substring(0, lines.get(i).indexOf(" "));
            secondValue = lines.get(i).length() == 1 ? null : lines.get(i).substring(lines.get(i).indexOf(" ") + 1);
            if (firstValue.equals("1")) {
                numbers.add(Integer.valueOf(secondValue));
                Collections.sort(numbers);
            }
            else {
                System.out.println(numbers.get(0));
                out.write(numbers.get(0).toString() + lineSeparator);
                numbers.remove(numbers.get(0));
            }
        }
        out.close();
    }
}
