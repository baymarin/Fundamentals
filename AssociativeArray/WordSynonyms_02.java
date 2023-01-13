package Fundamentals.AssociativeArray;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> inputMap = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            inputMap.putIfAbsent(word, new ArrayList<>());
            inputMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : inputMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
