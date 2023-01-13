package Fundamentals.DataTypesMoreExercise;

import java.util.Scanner;

public class DecryptingMessages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int magicNumber = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String decryptMessage = "";
        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            char symbol = (char) (input + magicNumber);
            decryptMessage += symbol;

        }
        System.out.println(decryptMessage);
    }
}
