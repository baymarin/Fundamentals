package Fundamentals.exersciseBasicSyntrax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        int counter = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            char pass = username.charAt(i);
            password += pass;

        }
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            counter++;
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
            if (counter == 3) {
                System.out.printf("User %s blocked!", username);
                return;
            }
        }
        System.out.printf("User %s logged in.", username);
    }
}
