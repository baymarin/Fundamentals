package Fundamentals.dataTypesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int waterIN = Integer.parseInt(scanner.nextLine());
            if (waterIN > capacity){
                System.out.println("Insufficient capacity!");
            }else {
                capacity -= waterIN;
                sum += waterIN;
            }
        }
        System.out.println(sum);
    }
}
