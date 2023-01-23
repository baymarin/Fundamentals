package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0;
        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            sum += price;

            command = scanner.nextLine();
        }
        if (sum == 0){
            System.out.println("Invalid order!");
            return;
        }
        double taxes = sum * 0.2;
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", sum);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        if (command.equals("special")) {
            System.out.printf("Total price: %.2f$", (sum + taxes) * 0.9);
        } else {
            System.out.printf("Total price: %.2f$", sum + taxes);
        }
    }
}

