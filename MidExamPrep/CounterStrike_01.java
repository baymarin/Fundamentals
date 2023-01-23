package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int winsCounter = 0;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (energy >= distance) {
                energy -= distance;
                winsCounter++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", winsCounter, energy);
                return;
            }
            if (winsCounter % 3 == 0) {
                energy += winsCounter;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", winsCounter, energy);
    }
}
