package Fundamentals.dataTypesExercise;

import java.util.Scanner;

public class IntegerOperation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int divideBy = Integer.parseInt(scanner.nextLine());
        int multiplyBy = Integer.parseInt(scanner.nextLine());

        System.out.println(((first + second) / divideBy) * multiplyBy);
    }
}
