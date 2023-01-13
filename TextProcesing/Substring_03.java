package Fundamentals.TextProcesing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removeWord = scanner.nextLine();
        String input = scanner.nextLine();

        int index = input.indexOf(removeWord);

        while (index != -1) {
            input = input.replace(removeWord, "");

            index = input.indexOf(removeWord);
        }
        System.out.println(input);
    }
}
