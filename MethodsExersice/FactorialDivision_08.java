package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        divisionFirstFactorialBySecond(firstNumber, secondNumber);
    }

    public static double divisionFirstFactorialBySecond(double first, double second) {
        firstFactorial(first);
        secondFactorial(second);
        double sumAfterDivision = firstFactorial(first) / secondFactorial(second);
        System.out.println(String.format("%.2f", sumAfterDivision));
        return sumAfterDivision;
    }

    public static double firstFactorial(double firstFactorial) {
        double sum = 1;
        for (int i = 1; i <= firstFactorial; i++) {
            sum *= i;
        }
        return sum;
    }

    public static double secondFactorial(double secondFactorial) {
        double sum = 1;
        for (int i = 1; i <= secondFactorial; i++) {
            sum *= i;
        }
        return sum;
    }
}
