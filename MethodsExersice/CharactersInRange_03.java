package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        if (start > end) {
            charsBetweenStartAndEnd(end, start);
        } else {
            charsBetweenStartAndEnd(start, end);
        }
    }

    public static void charsBetweenStartAndEnd(char first, char last) {
        for (int i = first + 1; i < last; i++) {
            System.out.print(String.format("%c ", i));
        }
    }
}
