package Fundamentals.Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());
        totalPrice(product, qty);
    }

    public static void totalPrice(String product, int qty) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f",qty * 1.5);
                break;
            case "water":
                System.out.printf("%.2f",qty * 1.0);
                break;
            case "coke":
                System.out.printf("%.2f",qty * 1.4);
                break;
            case "snacks":
                System.out.printf("%.2f",qty * 2.0);
                break;
        }

    }
}
