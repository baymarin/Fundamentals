package Fundamentals.ArrayMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int lastNumber = 0;
        int nextNumber = 1 ;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            lastNumber = nextNumber;
            nextNumber = sum;
            sum = nextNumber + lastNumber;


        }
        System.out.println(sum);
    }
}
