package Fundamentals.ExerciseArray;

import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] newArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            newArray[i] = Integer.parseInt(input[i]);
        }

        int length = 1;
        int bestLength = 0;
        int endIndex = -1;

        for (int i = 0; i < newArray.length - 1; i++) {
            int currentNum = newArray[i];
            int secondNum = newArray[i + 1];

            if (currentNum == secondNum) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    endIndex = i + 1;
                }
            } else {
                length = 1;
            }
        }
        for (int i = endIndex; i > endIndex - bestLength ; i--) {
            System.out.print(newArray[i] + " ");
        }
    }
}

