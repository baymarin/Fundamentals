package Fundamentals.exersciseBasicSyntrax;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtyOrder = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <= qtyOrder ; i++) {
            double sumPerDay = 0;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            sumPerDay = ((days * capsuleCount) * pricePerCapsule);
            totalSum += sumPerDay;
            System.out.printf("The price for the coffee is: $%.2f%n", sumPerDay);
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
