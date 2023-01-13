package Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder newPassword = new StringBuilder();
        while (!command.equals("Done")) {
            String[] tokens = command.split(" ", 2);
            switch (tokens[0]) {
                case "TakeOdd":
                    for (int i = 0; i < input.length(); i++) {
                        if (i % 2 != 0) {
                            newPassword.append(input.charAt(i));
                        }
                    }
                    input = newPassword.toString();
                    System.out.println(newPassword);
                    break;
                case "Cut":
                    String[] cutTokens = tokens[1].split(" ");
                    int index = Integer.parseInt(cutTokens[0]);
                    int length = index + Integer.parseInt(cutTokens[1]);
                    input = new StringBuilder(input).delete(index, length).toString();
                    System.out.println(input);
                    break;
                case "Substitute":
                    String target = tokens[1].split(" ")[0];
                    String replaceWith = tokens[1].split(" ")[1];
                    if (input.contains(target)) {
                        input = input.replace(target, replaceWith);
                        System.out.println(input);`
                    } else {
                        System.out.println("Nothing to replace!");
                    }

            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", input);
    }
}
