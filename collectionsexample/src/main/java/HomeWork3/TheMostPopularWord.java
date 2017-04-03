package HomeWork3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static HomeWork3.ReadFile.loadLines;

class ReadFile {
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

public class TheMostPopularWord {
    public static void main (String[] args) throws IOException {
        FileReader in = new FileReader("input.txt");
        List<String> lines = loadLines(in);
        ArrayList<String> words = new ArrayList<>();
        for (String list : lines) {
            String[] strings = list.split(" ");
            for (String string : strings) {
                words.add(string.toLowerCase());
            }
        }

        Map<String, Integer> counterWords = new HashMap<>();
        Integer maxCount = 1;
        Integer minCount = 1;
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterWords.get(word);
                if(count == null) {
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
        for(String word : counterWords.keySet()) {
            if (counterWords.get(word) != minCount) {
                maxWords.put(word, counterWords.get(word));
            }
        }

        for(String word : maxWords.keySet()) {
            System.out.println(word);
        }
    }
}
