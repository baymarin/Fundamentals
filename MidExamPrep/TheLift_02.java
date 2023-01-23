package Fundamentals.MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleOnQueue = Integer.parseInt(scanner.nextLine());
        int[] liftArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < liftArray.length; i++) {
            int currentWagon = liftArray[i];
            if (currentWagon < 4) {
                if (peopleOnQueue >= 4 - currentWagon) {
                    peopleOnQueue -= 4 - currentWagon;
                    liftArray[i] = 4;
                } else {
                    liftArray[i] += peopleOnQueue;
                    peopleOnQueue = 0;
                }
            }
        }
        boolean isFull = IntStream.range(0, liftArray.length).noneMatch(i -> liftArray[i] != 4);
        if (peopleOnQueue == 0 && !isFull) {
            System.out.println("The lift has empty spots!");
        } else if (peopleOnQueue != 0 && isFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleOnQueue);
        }
        printArray(liftArray);
    }


    private static void printArray(int[] liftArray) {
        for (int i : liftArray) {
            System.out.print(i + " ");
        }
    }
}

