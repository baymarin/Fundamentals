package Fundamentals.TextProcesing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < banWords.length; i++) {
            String currentWord = banWords[i];
            text = text.replace(banWords[i], repeatedString("*", banWords[i].length()));

        }

        System.out.println(text);
    }

    public static String repeatedString(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }

        return result;
    }
}
