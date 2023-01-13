package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoin = 0;
        int roomCounter = 0;

        for (int i = 0; i < input.length; i++) {
            String[] currentCommand = input[i].split(" ");
            String command = currentCommand[0];
            int commandStats = Integer.parseInt(currentCommand[1]);
            switch (command) {
                case "potion":
                    roomCounter++;
                    if (health + commandStats >= 100) {
                        int healing = 100 - health;
                        health = 100;
                        System.out.printf("You healed for %d hp.%n", healing);
                    } else {
                        health += commandStats;
                        System.out.printf("You healed for %d hp.%n", commandStats);
                    }
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    roomCounter++;
                    bitcoin += commandStats;
                    System.out.printf("You found %d bitcoins.%n", commandStats);
                    break;
            }
            if (!command.equals("potion") && !command.equals("chest")) {
                health -= commandStats;
                roomCounter++;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", roomCounter);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%nHealth: %d", bitcoin, health);
    }
}
