package Fundamentals.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        getMax(first, second);
        switch (input) {
            case "int":
                System.out.println(Math.max(Integer.parseInt(first), Integer.parseInt(second)));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;
            case "char":
                System.out.println(getMax(first.charAt(0), second.charAt(0)));
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}