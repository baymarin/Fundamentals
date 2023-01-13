package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            int currentSymbol = input.charAt(i) + 3;
            System.out.print((char) currentSymbol);
        }
    }
}
