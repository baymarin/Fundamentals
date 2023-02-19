package Fundamentals.MidExam;

import java.util.Scanner;

public class Second_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commandArr = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandArr.length; i++) {

            if (!commandArr[i].split(" ")[0].equals("Titan")) {
                String action = commandArr[i].split(" ")[0];
                int amount = Integer.parseInt(commandArr[i].split(" ")[1]);

                switch (action) {
                    case "Travel":
                        if (fuel >= amount) {
                            System.out.printf("The spaceship travelled %d light-years.%n", amount);
                            fuel -= amount;
                        } else {
                            System.out.println("Mission failed.");
                            return;
                        }
                        break;
                    case "Enemy":
                        if (ammunition < amount && fuel > (amount * 2)) {
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n", amount);
                            fuel -= amount * 2;
                        } else if (ammunition >= amount) {
                            System.out.printf("An enemy with %d armour is defeated.%n", amount);
                            ammunition -= amount;
                        } else {
                            System.out.println("Mission failed.");
                            return;
                        }
                        break;
                    case "Repair":
                        fuel += amount;
                        ammunition += amount * 2;

                        System.out.printf("Ammunitions added: %d.%n", amount * 2);
                        System.out.printf("Fuel added: %d.%n", amount);
                        break;
                }
            } else {
                System.out.println("You have reached Titan, all passengers are safe.");
                return;
            }

        }
    }
}

