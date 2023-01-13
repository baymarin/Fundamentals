package Fundamentals.exersciseBasicSyntrax;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int startNum = num;
        while (num > 0) {
            int fact = 1;
            int lastNum = num % 10;
            for (int j = 1; j <= lastNum; j++) {
                fact = fact * j;
            }
            sum += fact;
            num = num / 10;
        }
        if (sum == startNum) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
