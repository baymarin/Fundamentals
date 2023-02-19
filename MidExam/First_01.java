package Fundamentals.MidExam;

import java.util.Scanner;

public class First_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;
        int specialEventCounter = 1;
        int rainingDayCounter = 1;

        for (int i = 0; i < n; i++) {
            String nameOfTheCity = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (specialEventCounter % 3 == 0 && rainingDayCounter % 5 != 0) {
                expenses *= 1.5;
            }
            if (rainingDayCounter % 5 == 0) {
                income *= 0.9;
            }
            specialEventCounter++;
            rainingDayCounter++;

            double currentIncome = income - expenses;
            totalProfit += currentIncome;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameOfTheCity, currentIncome);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);
    }
}
