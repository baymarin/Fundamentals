package Fundamentals.DataTypesMoreExercise;

import java.util.Scanner;

public class FromLeftToRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String firstPart = parts[0];
            String secondPart = parts[1];
            long number1 = Long.parseLong(firstPart);
            long number2 = Long.parseLong(secondPart);
            long maxNumber = Math.max(number1, number2);
            int sum = 0;
            while (maxNumber != 0) {
                sum += Math.abs(maxNumber % 10);
                maxNumber = Math.abs(maxNumber / 10);
            }
            System.out.println(Math.abs(sum));
        }

    }
}
