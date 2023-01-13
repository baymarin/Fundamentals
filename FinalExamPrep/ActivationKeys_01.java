package Fundamentals.FinalExamPrep;

import java.util.*;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builtCommand = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] tokens = command.split(">>>", 2);
            switch (tokens[0]) {
                case "Contains":
                    String substring = tokens[1];
                    if (builtCommand.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", builtCommand, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip": {
                    String[] fullySplit = command.split(">>>");
                    String flipTo = fullySplit[1];
                    int startIndex = Integer.parseInt(fullySplit[2]);
                    int endIndex = Integer.parseInt(fullySplit[3]);
                    String indexes = builtCommand.substring(startIndex, endIndex);
                    switch (flipTo) {
                        case "Upper":
                            builtCommand.replace(startIndex, endIndex, indexes.toUpperCase());
                            break;
                        case "Lower":
                            builtCommand.replace(startIndex, endIndex, indexes.toLowerCase());
                            break;
                    }
                    System.out.println(builtCommand);
                }
                break;
                case "Slice":
                    String[] fullySplit = command.split(">>>");
                    int startIndex = Integer.parseInt(fullySplit[1]);
                    int endIndex = Integer.parseInt(fullySplit[2]);
                    builtCommand.delete(startIndex, endIndex);
                    System.out.println(builtCommand);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", builtCommand);
    }
}
