package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isTopNumber(int number) {
        int sum = 0;
        boolean oddCounter = false;
        while (number > 0) {
            int lastDigit =  number % 10;
            number = number / 10;
            sum += lastDigit;
            if (lastDigit % 2 != 0){
                oddCounter = true;
            }
        }
        if (sum % 8 == 0 && oddCounter){
            return true;
        }
        return false;
    }
}
