package Fundamentals.Array;

import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        while (array.length > 1) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i] + array[i + 1];
            }
            array = newArray;
        }
        System.out.println(array[0]);
    }
}
