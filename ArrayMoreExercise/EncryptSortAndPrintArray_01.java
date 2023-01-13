package Fundamentals.ArrayMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] sumToArray = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                char currentLetter = input.charAt(j);
                if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' ||
                        currentLetter == 'o' || currentLetter == 'u' || currentLetter == 'A' || currentLetter == 'E'
                ||currentLetter == 'I' || currentLetter == 'O' || currentLetter =='U') {
                    sum += currentLetter * input.length();
                } else {
                    sum += currentLetter / input.length();
                }
            }
            sumToArray[i] = sum;
        }
        Arrays.sort(sumToArray);
        for (int element : sumToArray) {
            System.out.println(element);
        }
    }
}
