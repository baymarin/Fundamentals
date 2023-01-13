package Fundamentals.TextProcesing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(repeatedWord(words[i]));
        }
        System.out.println(result);
    }

    public static String repeatedWord(String word) {
        String updatedWord = "";
        for (int i = 0; i < word.length(); i++) {
            updatedWord += word;
        }
        return updatedWord;
    }
}
