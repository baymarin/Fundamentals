package Fundamentals.ObjectAndClasses.RandomWords;

import java.util.Random;
import java.util.Scanner;

public class RandomWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < input.length; i++) {
            int swapIndex = rnd.nextInt(input.length);
            String tmp = input[i];
            input[i] = input[swapIndex];
            input[swapIndex] = tmp;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
