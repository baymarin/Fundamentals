package Fundamentals.Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        repeatedString(input, n);
    }

    public static String repeatedString(String input, int times) {
        String result = "";
        for (int j = 0; j < times; j++) {
            for (int i = 0; i < input.length(); i++) {
                result += input.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }
}
