package Fundamentals.FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "^@#*(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+$";
        String digitRegex = "\\d";


        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Pattern barcodePattern = Pattern.compile(regex);
            Matcher barcodeMatcher = barcodePattern.matcher(barcode);
            Pattern digitFinder = Pattern.compile(digitRegex);

            if (!barcodeMatcher.find()) {
                System.out.println("Invalid barcode");
            } else {
                String currentBarcode = barcodeMatcher.group();
                Matcher digitMatcher = digitFinder.matcher(currentBarcode);
                String concatDigit = "";
                while (digitMatcher.find()) {
                    concatDigit += (digitMatcher.group());
                }
                if (concatDigit.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", concatDigit.toString());
                }
            }
        }
    }
}
