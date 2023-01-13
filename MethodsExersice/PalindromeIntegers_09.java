package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            isIntegerPalindrome(command);
            command = scanner.nextLine();
        }
    }

    public static boolean isIntegerPalindrome(String number) {
        String forward = "";
        String backward = "";
        for (int i = 0; i < number.length(); i++) {
            forward += number.charAt(i);
        }
        for (int i = number.length() - 1; i >= 0; i--) {
            backward += number.charAt(i);
        }
        if (forward.equals(backward)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
        }
        return false;
    }
}
