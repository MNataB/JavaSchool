package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetOfNumbers4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Integer countOper = Integer.valueOf(reader.readLine());
        String strValue;
        String string;
        int[] numbers = new int[countOper];
        Integer minValue = 0;
        int i = 0;
        for (int cnt = 0; cnt < countOper; cnt++) {
            string = reader.readLine();
            if (string.length() > 1) {
                strValue = string.substring(string.indexOf(" ") + 1);
                numbers[i] = Integer.valueOf(strValue);
                i++;
            }
            else {
                Arrays.sort(numbers);
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}

