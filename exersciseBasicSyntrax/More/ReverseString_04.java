package Fundamentals.exersciseBasicSyntrax.More;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        for (int i = command.length() -1; i >= 0 ; i--) {
            System.out.print(command.charAt(i));

        }
    }
}
