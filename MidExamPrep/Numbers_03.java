package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : inputArr) {
            sum += i;
        }
        boolean isEqual = false;
        double average = sum / (inputArr.length * 1.0);
        if (inputArr.length > 1) {
            for (int i = 0; i < inputArr.length - 1; i++) {
                int current = inputArr[i];
                int next = inputArr[i + 1];
                if (current == next) {
                    isEqual = true;
                } else {
                    isEqual = false;
                }
            }
            if (isEqual) {
                System.out.println("No");
                return;
            }
        }

        if (inputArr.length <= 1) {
            System.out.println("No");
            return;
        } else {
            for (int i = inputArr.length - 1; i >= 0; i--) {
                if (inputArr[i] > average) {
                    list.add(inputArr[i]);
                }
            }
        }

        list.sort(Collections.reverseOrder());
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (counter < 5) {
                System.out.print(list.get(i) + " ");
                counter++;
            } else {
                break;
            }
        }
    }
}

