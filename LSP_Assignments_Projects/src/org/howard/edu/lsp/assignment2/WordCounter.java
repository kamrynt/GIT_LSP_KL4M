package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "./word.txt";
        countWords(filePath);
    }
    

    private static void countWords(String filePath) {
        Map<String, Integer> wordCounts = new HashMap<>();
        Pattern pattern = Pattern.compile("[^a-zA-Z]");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = pattern.matcher(line.toLowerCase()).replaceAll(" ").split("\\s+");
                for (String word : words) {
                    if (word.length() > 3) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
