package Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        int poweredBy = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(firstPoweredBySecond(firstNum, poweredBy)));
    }

    public static double firstPoweredBySecond(double firstNumber, int poweredBy) {
        double result = Math.pow(firstNumber, poweredBy);
        return result;
    }
}
