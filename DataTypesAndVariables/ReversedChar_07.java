package Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class ReversedChar_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        String output = String.format("%s %s %s", third, second, first);
        System.out.println(output);
    }
}
