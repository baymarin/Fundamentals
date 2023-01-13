package Fundamentals.DataTypesMoreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= input; i++) {
            boolean isItPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isItPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isItPrime);
        }
    }
}