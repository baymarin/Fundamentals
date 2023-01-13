package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder outcome = new StringBuilder(input);
        int counter = 0;
        int deletingFromIndex = 0;
        for (int i = 0; i < outcome.length() - 1; i++) {
            if (outcome.charAt(i) == outcome.charAt(i + 1)) {
                outcome.deleteCharAt(i);
                i--;
            }

        }
        System.out.println(outcome);
    }
}
