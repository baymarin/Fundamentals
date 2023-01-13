package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodQty = Double.parseDouble(scanner.nextLine());
        double hayQty = Double.parseDouble(scanner.nextLine());
        double coverQty = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());

        double foodInGrams = foodQty * 1000;
        double hayInGrams = hayQty * 1000;
        double coverInGrams = coverQty * 1000;
        double pigInGrams = pigWeight * 1000;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;
            if (i % 2 == 0) {
                double fivePercentHay = foodInGrams * 0.05;
                hayInGrams -= fivePercentHay;
            }
            if (i % 3 == 0) {
                double oneThirdOfPigsWeight = pigInGrams / 3;
                coverInGrams -= oneThirdOfPigsWeight;
            }
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f."
                , foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);
    }
}
