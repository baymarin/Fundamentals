package Fundamentals.exersciseBasicSyntrax;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sumMoney = 0;
        while (!command.equals("Start")) {
            double amountCoins = Double.parseDouble(command);
            if (amountCoins == 0.1 || amountCoins == 0.2 || amountCoins == 0.5 || amountCoins == 1 || amountCoins == 2) {
                sumMoney += amountCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", amountCoins);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            if (product.equals("Nuts") && sumMoney >= 2.00) {
                sumMoney -= 2.0;
                System.out.printf("Purchased %s%n", product);
            } else if (product.equals("Nuts") && sumMoney < 2) {
                System.out.println("Sorry, not enough money");
            }
            if (product.equals("Water") && sumMoney >= 0.7) {
                sumMoney -= 0.7;
                System.out.printf("Purchased %s%n", product);
            } else if (product.equals("Water") && sumMoney < 0.7) {
                System.out.println("Sorry, not enough money");
            }
            if (product.equals("Crisps") && sumMoney >= 1.5) {
                sumMoney -= 1.5;
                System.out.printf("Purchased %s%n", product);
            } else if (product.equals("Crisps") && sumMoney < 1.5) {
                System.out.println("Sorry, not enough money");
            }
            if (product.equals("Soda") && sumMoney >= 0.8) {
                sumMoney -= 0.8;
                System.out.printf("Purchased %s%n", product);
            } else if (product.equals("Soda") && sumMoney < 0.8) {
                System.out.println("Sorry, not enough money");
            }
            if (product.equals("Coke") && sumMoney >= 1) {
                sumMoney -= 1;
                System.out.printf("Purchased %s%n", product);
            } else if (product.equals("Coke") && sumMoney < 1) {
                System.out.println("Sorry, not enough money");
            }
            if (!product.equals("Nuts") && !product.equals("Water") && !product.equals("Crisps") && !product.equals("Soda") && !product.equals("Coke")){
                System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumMoney);
    }
}