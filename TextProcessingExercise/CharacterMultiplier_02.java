package Fundamentals.TextProcessingExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstWord = input.split(" ")[0];
        String secondWord = input.split(" ")[1];

        System.out.println(sumOfValue(firstWord, secondWord));
    }

    public static int sumOfValue(String firstWord, String secondWord) {
        int sum = 0;
        if (firstWord.length() > secondWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                int currentIteration = firstWord.charAt(i) * secondWord.charAt(i);
                sum += currentIteration;
            }
            String leftovers = firstWord.substring(secondWord.length());
            for (int i = 0; i < leftovers.length(); i++) {
                sum += leftovers.charAt(i);
            }
        } else {
            for (int i = 0; i < firstWord.length(); i++) {
                int currentIteration = firstWord.charAt(i) * secondWord.charAt(i);
                sum += currentIteration;
            }
            String leftovers = secondWord.substring(firstWord.length());
            for (int i = 0; i < leftovers.length(); i++) {
                sum += leftovers.charAt(i);
            }
        }
        return sum;
    }
}
