package HomeWork3;

// рабочий вариант, но неоптимальный по времени - не прохоит три теста

import java.util.*;

public class SetOfNumber5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    numbers.add(Integer.valueOf(scanner.next()));
                    break;
                case "2":
                    Integer minValue = Collections.min(numbers);
                    System.out.println(minValue);
                    numbers.remove(minValue);
                    break;
            }
        }
        scanner.close();
    }
}