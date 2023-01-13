package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNum = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        int secondNum = Integer.parseInt(scanner.nextLine());
        StringBuilder finalSum = new StringBuilder();
        int decimalNum = 0;
        if (bigNum.isEmpty()) {
            bigNum = "0";
        }
        if (secondNum == 0) {
            System.out.println(0);
            return;
        }
        for (int i = bigNum.length() - 1; i >= 0; i--) {
            int num = (int) bigNum.charAt(i) - 48;
            int currentSum = num * secondNum;
            currentSum += decimalNum;
            finalSum.append(currentSum % 10);
            decimalNum = currentSum / 10;

        }
        if (decimalNum > 0) {
            finalSum.append(decimalNum);

        }
        System.out.println(finalSum.reverse());
    }
}
