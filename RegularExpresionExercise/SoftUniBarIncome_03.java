package Fundamentals.RegularExpresionExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^%(?<name>[A-Z][a-z]*)%[^|&%.]*<(?<item>\\w+)>[^|&%.]*\\|(?<qty>\\d+)\\|[^|&%.]*?(?<price>[\\d]*\\.*[\\d]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("item");
                int qty = Integer.parseInt(matcher.group("qty"));
                double price = Double.parseDouble(matcher.group("price"));
                double currentPrice = qty * price;
                totalIncome += currentPrice;

                System.out.printf("%s: %s - %.2f%n", name, product, currentPrice);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
