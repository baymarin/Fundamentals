package Fundamentals.Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
      area(width, height);
    }

    public static double area(double width, double height) {
        double result = width * height;
        System.out.printf("%.0f", result);
        return result;
    }
}
