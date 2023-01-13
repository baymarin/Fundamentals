package Fundamentals.ExerciseArray;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < num % array.length; j++) {
            String currentNum = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = currentNum;
        }
        System.out.println(String.join(" ", array));
    }
}
