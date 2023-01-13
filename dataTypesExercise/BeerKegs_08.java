package Fundamentals.dataTypesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = 0.0;
        String bestModel = "";
        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double capacityKeg = Math.PI * Math.pow(radius ,2) * height;
            if (capacityKeg > biggestKeg){
                biggestKeg = capacityKeg;
                bestModel = model;
            }
        }
        System.out.println(bestModel);
    }
}
