package Fundamentals.DataTypesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftBrackets = 0;
        int rightBrackets = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                leftBrackets++;
            } else if (input.equals(")")) {
                rightBrackets++;
                if (leftBrackets - rightBrackets != 0) {
                        System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if (leftBrackets == rightBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
