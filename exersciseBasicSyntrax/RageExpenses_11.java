package Fundamentals.exersciseBasicSyntrax;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        int headsetQty = lostGames / 2;
        int mouseQty = lostGames / 3;
        int keyboardQty = lostGames / 6;
        int displayQty = lostGames / 12;
        double total = (headsetQty * headset) + (mouseQty * mouse) + (keyboardQty * keyboard) + (displayQty * display);
        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
