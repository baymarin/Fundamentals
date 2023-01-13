package Fundamentals.TextProcesing;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digitsSymbols = new StringBuilder();
        StringBuilder lettersSymbols = new StringBuilder();
        StringBuilder othersSymbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSym = input.charAt(i);
            if (Character.isDigit(currentSym)) {
                digitsSymbols.append(currentSym);
            } else if (Character.isLetter(currentSym)) {
                lettersSymbols.append(currentSym);
            } else {
                othersSymbols.append(currentSym);
            }
        }
        System.out.println(digitsSymbols);
        System.out.println(lettersSymbols);
        System.out.println(othersSymbols);
    }
}
