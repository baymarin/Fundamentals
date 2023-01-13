package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleChar(input);
    }

    public static void middleChar(String input) {

        if (input.length() % 2 == 0) {
            char firstSymbol = input.charAt(input.length() / 2 - 1);
            System.out.print(firstSymbol);
        }
        char secondSymbol = input.charAt(input.length() / 2);
        System.out.println(secondSymbol);
    }
}
