package Fundamentals.Array;

import java.util.Scanner;

public class SumEvenNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] items = input.split(" ");
        int[] arr = new int[items.length];
        int evenSum = 0;
        for (int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }
        System.out.println(evenSum);
    }
}
