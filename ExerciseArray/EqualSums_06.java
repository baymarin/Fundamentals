package Fundamentals.ExerciseArray;

import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] newArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            newArray[i] = Integer.parseInt(input[i]);
        }
        boolean flag = true;
        for (int i = 0; i < newArray.length; i++) {
            int currentIndex = i;
            int leftSum = 0;
            int rightSum = 0;
            for (int j = currentIndex - 1; j >= 0; j--) {
                leftSum += newArray[j];
            }
            for (int j = currentIndex + 1; j < newArray.length; j++) {
                rightSum += newArray[j];
            }
            if (leftSum == rightSum) {
                flag = false;
                System.out.println(currentIndex);
            }

        }
        if (flag) {
            System.out.println("no");
        }
    }
}


