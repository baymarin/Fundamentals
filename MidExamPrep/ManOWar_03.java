package Fundamentals.MidExamPrep;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstShip = scanner.nextLine();
        String secondShip = scanner.nextLine();

        ArrayList<Integer> pirateShip = (ArrayList<Integer>) Arrays.stream(firstShip.split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        ArrayList<Integer> warShip = (ArrayList<Integer>) Arrays.stream(secondShip.split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Retire")) {
            String[] tokens = input.split(" ", 2);
            switch (tokens[0]) {
                case "Fire": {
                    String[] result = tokens[1].split(" ");
                    int index = Integer.parseInt(result[0]);
                    int damage = Integer.parseInt(result[1]);
                    if (index < 0 || index >= warShip.size()) {
                        break;
                    } else {
                        int wantedIndex = warShip.get(index);
                        wantedIndex -= damage;
                        warShip.remove(index);
                        warShip.add(index, wantedIndex);
                        if (wantedIndex <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                }
                case "Defend": {
                    String[] result = tokens[1].split(" ");
                    int startIndex = Integer.parseInt(result[0]);
                    int endIndex = Integer.parseInt(result[1]);
                    int damage = Integer.parseInt(result[2]);
                    if (startIndex >= 0 && endIndex <= pirateShip.size() - 1 && endIndex >= 0 &&
                            startIndex <= pirateShip.size() - 1) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int currentIndex = pirateShip.get(i);
                            currentIndex -= damage;
                            pirateShip.remove(i);
                            pirateShip.add(i, currentIndex);
                            if (currentIndex <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    } else {
                        break;
                    }
                }
                break;
                case "Repair":
                    String[] result = input.split(" ");
                    int index = Integer.parseInt(result[1]);
                    int health = Integer.parseInt(result[2]);
                    if (index >= 0 && index < pirateShip.size()) {
                        int currentIndex = pirateShip.get(index);
                        currentIndex += health;
                        if (currentIndex > maximumHealthCapacity) {
                            currentIndex = maximumHealthCapacity;
                        }
                        pirateShip.remove(index);
                        pirateShip.add(index, currentIndex);
                    } else {
                        break;
                    }
                    break;
                case "Status":
                    double twentyPercent = maximumHealthCapacity * 0.2;
                    int counter = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        int currentSection = pirateShip.get(i);
                        if (currentSection < twentyPercent) {
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counter);
            }
            input = scanner.nextLine();
        }
        int pirateShipSum = 0;
        int warShipSum = 0;
        for (Integer section : pirateShip) {
            pirateShipSum += section;
        }
        for (Integer section : warShip) {
            warShipSum += section;
        }
        System.out.printf("Pirate ship status: %d%nWarship status: %d", pirateShipSum, warShipSum);
    }
}
