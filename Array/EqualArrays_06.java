package Fundamentals.Array;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        int[] firstToNum = new int[firstArr.length];
        int[] secondToNum = new int[secondArr.length];
        int sum = 0;
        int secondSum = 0;
        for (int i = 0; i < firstArr.length; i++) {
            firstToNum[i] = Integer.parseInt(firstArr[i]);
        }
        for (int j = 0; j < secondArr.length; j++) {
            secondToNum[j] = Integer.parseInt(secondArr[j]);
        }
        for (int i = 0; i < firstToNum.length ; i++) {
            if (firstToNum[i] != secondToNum[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }else {
                sum += firstToNum[i];
                secondSum += secondToNum[i];
            }
        }
        if (sum == secondSum){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}


