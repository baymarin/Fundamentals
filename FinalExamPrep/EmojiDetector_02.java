package Fundamentals.FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern threshold = Pattern.compile("\\d");
        Matcher thresholdMatcher = threshold.matcher(input);

        Pattern coolEmojis = Pattern.compile("(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))");
        Matcher emojiMatcher = coolEmojis.matcher(input);

        long thresholdSum = 1;
        while (thresholdMatcher.find()) {
            String current = thresholdMatcher.group();
            thresholdSum *= Integer.parseInt(current);
        }
        System.out.printf("Cool threshold: %d%n", thresholdSum);

        int emojiCounter = 0;
        List<String> coolEmoji = new ArrayList<>();
        while (emojiMatcher.find()) {
            int emojiSum = 0;
            String currentEmoji = emojiMatcher.group("name");
            for (int i = 0; i < currentEmoji.length(); i++) {
                char currentChar = currentEmoji.charAt(i);
                if (Character.isLetter(currentChar)) {
                    emojiSum += currentChar;
                }
            }
            emojiCounter++;
            if (emojiSum > thresholdSum) {
                coolEmoji.add(currentEmoji);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are: %n", emojiCounter);
        for (String s : coolEmoji) {
            System.out.println(s);
        }
    }
}
