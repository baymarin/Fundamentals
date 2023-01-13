package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        double sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            String currentString = inputArr[i];
            char firstLetter = currentString.charAt(0);
            char lastLetter = currentString.charAt(currentString.length() - 1);
            double currentNumb = Integer.parseInt(currentString.substring(1, currentString.length() - 1));
            double currentSum = 0;

            if (Character.isUpperCase(firstLetter)) {
                int position = firstLetter - 64;
                currentSum += currentNumb / position;
            } else {
                int position = firstLetter - 96;
                currentSum += currentNumb * position;
            }

            if (Character.isUpperCase(lastLetter)) {
                int position = lastLetter - 64;
                currentSum -= position;
            } else {
                int position = lastLetter - 96;
                currentSum += position;
            }
            sum += currentSum;
        }
        System.out.printf("%.2f", sum);
    }
}
