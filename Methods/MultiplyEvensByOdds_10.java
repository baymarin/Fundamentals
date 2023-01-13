package Fundamentals.Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyEvenByOdd(integer));
    }

    public static int multiplyEvenByOdd(int digit) {
        int evenSum = 0;
        int oddSum = 0;
        while (digit != 0) {
            int lastNum = digit % 10;
            digit = digit / 10;
            if (lastNum % 2 == 0) {
                evenSum += lastNum;
            } else {
                oddSum += lastNum;
            }
        }
        int properSum = evenSum * oddSum;
        return properSum;
    }
}
