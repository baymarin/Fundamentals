package Fundamentals.exersciseBasicSyntrax.More;

import java.util.Scanner;
// Not My Solution !!!
public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letterCount = Integer.parseInt(scanner.nextLine());
        String word = "";

        for (int i = 1; i <= letterCount; i++) {
            String messageDigit = scanner.nextLine();
            int mainDigit = Integer.parseInt(messageDigit);
            mainDigit = mainDigit % 10;
            int digit = 0;
            if (mainDigit == 8 || mainDigit == 9) {
                int textLength = (messageDigit.length() - 1);
                digit = 1 + ((mainDigit - 2) * 3) + textLength;
            } else {
                int textLength = (messageDigit.length() - 1);
                digit = ((mainDigit - 2) * 3) + textLength;
            }
            if (mainDigit == 0) {
                word += " ";
                continue;
            }
            char letter = (char) (97 + digit);
            word += letter;
        }
        System.out.println(word);
    }
}