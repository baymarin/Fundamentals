package Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int currentNum = 0;
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            boolean result = false;
            result = (sum == 5) || (sum == 7) || (sum == 11);
            sum = 0;
            i = currentNum;
            if (result) {
                System.out.printf("%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n", currentNum);
            }
        }
    }
}
