package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isCorrectPassword = isValid(password);
        if (isCorrectPassword) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValid(String password) {
        boolean isEnough = isPasswordBetweenSixAndTen(password);
        boolean passwordLetterAndDigits = doesPasswordHaveOnlyLetterAndDigits(password);
        boolean passwordTwoDigits = areThereAtLeastTwoDigits(password);
        boolean isAValidPassword = isEnough && passwordLetterAndDigits && passwordTwoDigits;
        return isAValidPassword;
    }

    public static boolean isPasswordBetweenSixAndTen(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return false;
    }

    public static boolean doesPasswordHaveOnlyLetterAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean areThereAtLeastTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                counter++;
                if (counter == 2) {
                    break;
                }
            }
        }
        if (counter == 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}