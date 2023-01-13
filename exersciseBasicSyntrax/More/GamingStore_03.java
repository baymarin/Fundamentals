package Fundamentals.exersciseBasicSyntrax.More;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double sum = 0;
        while (!gameName.equals("Game Time")) {
            if (!gameName.equals("OutFall 4") && !gameName.equals("CS: OG") && !gameName.equals("Zplinter Zell") && !gameName.equals("Honored 2")
                    && !gameName.equals("RoverWatch") && !gameName.equals("RoverWatch Origins Edition")) {
                System.out.println("Not Found");
            }
            if (gameName.equals("OutFall 4")) {
                if (budget < 39.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                }
                budget -= 39.99;
                sum += 39.99;
                System.out.printf("Bought %s%n", gameName);
            } else if (gameName.equals("CS: OG")) {
                if (budget < 15.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                }
                sum += 15.99;
                budget -= 15.99;
                System.out.printf("Bought %s%n", gameName);
            } else if (gameName.equals("Zplinter Zell")) {
                if (budget < 19.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                }
                sum += 19.99;
                budget -= 19.99;
                System.out.printf("Bought %s%n", gameName);
            } else if (gameName.equals("Honored 2")) {
                if (budget < 59.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                }
                sum += 59.99;
                budget -= 59.99;
                System.out.printf("Bought %s%n", gameName);
            } else if (gameName.equals("RoverWatch")) {
                if (budget < 29.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                }
                sum += 29.99;
                budget -= 29.99;
                System.out.printf("Bought %s%n", gameName);
            } else if (gameName.equals("RoverWatch Origins Edition")) {
                if (budget < 39.99) {
                    System.out.println("Too Expensive");
                    gameName = scanner.nextLine();
                    continue;
                }
                sum += 39.99;
                budget -= 39.99;
                System.out.printf("Bought %s%n", gameName);
            }
            if (budget <= 0) {
                System.out.println("Out of money!");
                break;
            }
            gameName = scanner.nextLine();
        }
        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, budget);
        }
    }
}
