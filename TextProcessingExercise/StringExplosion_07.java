package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder outcome = new StringBuilder(input);
        int power = 0;

        for (int i = 0; i < outcome.length(); i++) {
            if (outcome.charAt(i) == '>') {
                power += Integer.parseInt(outcome.charAt(i + 1) + "");
            } else if (outcome.charAt(i) != '>' && power > 0) {
                outcome.deleteCharAt(i);
                power--;
                i--;
            }
        }
        System.out.println(outcome);
    }
}
