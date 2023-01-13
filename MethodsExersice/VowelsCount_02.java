package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(vowelsCounter(input));
    }

    public static int vowelsCounter(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            String toLower = input.toLowerCase();
            char letter = toLower.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                    counter++;
                    break;
            }
        }
    return counter;
    }
}
