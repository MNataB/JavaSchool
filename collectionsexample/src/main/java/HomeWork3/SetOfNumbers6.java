package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SetOfNumbers6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer countOper = Integer.valueOf(scanner.next());
        int[] arr = new int[countOper];
        int i = 0;
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1" :
                    arr[i++] = (int) Integer.valueOf(scanner.next());
                    break;
                case "2" :
                    int[] tmpArr = new int[i];
                    System.arraycopy(arr,0,tmpArr,0,i);
                    break;
            }
        }
        scanner.close();
    }
}
