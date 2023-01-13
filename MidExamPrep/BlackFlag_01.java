package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= daysOfPlunder; i++) {
            if (i % 3 != 0) {
                sum += dailyPlunder;
            } else {
                sum += dailyPlunder + (dailyPlunder * 0.5);
            }
            if (i % 5 == 0) {
                sum -= (sum * 0.3);
            }
        }
        if (sum >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        }else {
        double leftovers = expectedPlunder - sum;
        double sumPercent = (sum / expectedPlunder) * 100 ;

            System.out.printf("Collected only %.2f%% of the plunder.", sumPercent);

        }
    }
}
