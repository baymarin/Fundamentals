package Fundamentals.Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNumb = Integer.parseInt(scanner.nextLine());
        int secondNumb = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "add":
                add(firstNumb, secondNumb);
                break;
            case "divide":
                divide(firstNumb, secondNumb);
                break;
            case "multiply":
                multiply(firstNumb, secondNumb);
                break;
            case "subtract":
                subtract(firstNumb, secondNumb);
                break;
        }
    }

    public static void add(int first, int second) {
        System.out.println(first + second);
    }

    public static void divide(int first, int second) {
        System.out.println(first / second);
    }

    public static void multiply(int first, int second) {
        System.out.println(first * second);
    }

    public static void subtract(int first, int second) {
        System.out.println(first - second);
    }
}
