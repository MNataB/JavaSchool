package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SetOfNumbers4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Integer countOper = Integer.valueOf(reader.readLine());
        String string;
        int[] arr = new int[countOper];
        int i = 0;
        for (int n = 0; n < countOper; n++) {
            string = reader.readLine();
            if (string.length() > 1) {
                arr[i] = Integer.valueOf(string.substring(string.indexOf(" ") + 1));
                i++;
            }
            else {
                int minValue = 0;
                int minIndex = 0;
                for (int k = 0; k < countOper; k++) {
                    if (arr[k] != 0) {
                        minValue = arr[k];
                        minIndex = k;
                        break;
                    }
                }
                for (int k = minIndex + 1; k < i; k++) {
                    if ((arr[k] != 0) && (arr[k] < minValue)) {
                        minValue = arr[k];
                        minIndex = k;
                    }
                }
                System.out.println(minValue);
                arr[minIndex] = 0;
            }
        }
    }
}

