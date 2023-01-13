package Fundamentals.DataTypesMoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;
        if (Math.abs(first - second) < eps){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
