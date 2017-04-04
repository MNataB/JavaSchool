package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TheMostPopularWord2 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("input.txt");
        BufferedReader reader = new BufferedReader(in);
        List<String> words = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            for (String string : line.split(" ")) {
                if (line.isEmpty())
                    continue;
                words.add(string.toLowerCase());
            }
        }
        reader.close();

        Map<String, Integer> counterWords = new HashMap<>();
        Integer maxCount = 1;
        Integer minCount = 1;
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = counterWords.get(word);
                if (count == null) {
                    count = 0;
                }
                counterWords.put(word, ++count);
                if (counterWords.get(word) > maxCount) {
                    maxCount = counterWords.get(word);
                }
            }
        }

        if (maxCount == minCount) minCount = 0;
        Map<String, Integer> maxWords = new TreeMap<>();
        for (String word : counterWords.keySet()) {
            if (counterWords.get(word) != minCount) {
                maxWords.put(word, counterWords.get(word));
            }
        }

        for (String word : maxWords.keySet()) {
            System.out.println(word);
        }
    }
}