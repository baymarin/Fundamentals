package Fundamentals.dataTypesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int yieldSum = 0;
        int days = 0;
        if (startingYield < 100) {
            System.out.println(days);
            System.out.println(yieldSum);
            return;
        }
        while (startingYield >= 100) {
            yieldSum += startingYield - 26;
            startingYield -= 10;
            days++;
        }
        System.out.println(days);
        System.out.println(yieldSum - 26);
    }
}
