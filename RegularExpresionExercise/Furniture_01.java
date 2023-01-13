package Fundamentals.RegularExpresionExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> purchasedItems = new ArrayList<>();
        double totalSum = 0;
        String regex = "^>>(?<item>[A-Z]*[a-z]*)<<(?<price>\\d*\\.*\\d*)!(?<qty>\\d*)\\b";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String item = matcher.group("item");
                purchasedItems.add(item);
                double price = Double.parseDouble(matcher.group("price"));
                int qty = Integer.parseInt(matcher.group("qty"));
                double currentItemPrice = price * qty;
                totalSum += currentItemPrice;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String item : purchasedItems) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
