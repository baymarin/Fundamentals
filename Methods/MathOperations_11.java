package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.##").format(resultAfterProperOperation(firstNum, operator, secondNum)));
    }

    public static double resultAfterProperOperation(double first, String operator, double second) {
        double result = 0;
        switch (operator) {
            case "-":
                result = Math.abs(first - second);
                break;
            case "+":
                result = first + second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = Math.abs(first / second);
                break;
        }
        return result;
    }
}
