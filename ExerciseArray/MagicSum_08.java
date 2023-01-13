package Fundamentals.ExerciseArray;

import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] newArray = new int[input.length];
        int neededNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input.length; i++) {
            newArray[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < newArray.length - 1; i++) {
            int firstNum = newArray[i];
            for (int j = i + 1; j < newArray.length; j++) {
                int secondNum = newArray[j];
                if (firstNum + secondNum == neededNum) {
                    System.out.println(newArray[i] + " " + newArray[j]);
                }
            }
        }
    }
}