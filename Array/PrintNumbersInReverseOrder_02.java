package Fundamentals.Array;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            int readNum = Integer.parseInt(scanner.nextLine());
            number[i] = readNum;
        }
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);

        }
    }
}
