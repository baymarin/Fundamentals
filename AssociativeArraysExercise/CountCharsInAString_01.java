package Fundamentals.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i];
            String[] wordInChars = currentWord.split("");
            for (int j = 0; j < wordInChars.length; j++) {
                String currentChar = wordInChars[j];
                if (!newMap.containsKey(currentChar)) {
                    newMap.put(currentChar, 0);
                }
                newMap.put(currentChar, newMap.get(currentChar) + 1);

            }
        }
        newMap.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));


//        for (String entry : newMap.keySet()) {
//            System.out.printf("%s -> %d%n", entry, newMap.get(entry));
    }
}

