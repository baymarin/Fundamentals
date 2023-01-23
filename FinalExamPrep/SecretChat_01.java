package Fundamentals.FinalExamPrep;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] tokens = command.split(":\\|:");
            switch (tokens[0]) {
                case "ChangeAll":
                    String replace = tokens[1];
                    String replaceWith = tokens[2];
                    String newString = null;
                    if (input.contains(replace)) {
                        newString = input.replace(replace, replaceWith);
                    }
                    System.out.println(newString);
                    break;

                case "Reverse":
                    break;
                case "InsertSpace":
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
