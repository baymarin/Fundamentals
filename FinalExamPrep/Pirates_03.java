package Fundamentals.FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> townsMapAndGold = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> townsMapAndPopulation = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            String town = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);
            if (!townsMapAndGold.containsKey(town) && !townsMapAndPopulation.containsKey(town)) {
                townsMapAndGold.put(town, gold);
                townsMapAndPopulation.put(town, population);
            } else {
                int currentGold = townsMapAndGold.get(town);
                int currentPopulation = townsMapAndPopulation.get(town);
                townsMapAndGold.put(town, currentGold + gold);
                townsMapAndPopulation.put(town, currentPopulation + population);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("=>");
            String action = tokens[0];
            String town = tokens[1];
            switch (action) {
                case "Plunder":
                    int population = Integer.parseInt(tokens[2]);
                    int gold = Integer.parseInt(tokens[3]);
                    int currentTownGold = townsMapAndGold.get(town) - gold;
                    int currentPopulation = townsMapAndPopulation.get(town) - population;
                    townsMapAndGold.put(town, currentTownGold);
                    townsMapAndPopulation.put(town, currentPopulation);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, population);
                    if (townsMapAndGold.get(town) <= 0 || townsMapAndPopulation.get(town) <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        townsMapAndGold.remove(town);
                        townsMapAndPopulation.remove(town);
                    }
                    break;
                case "Prosper":
                    int increasedGold = Integer.parseInt(tokens[2]);
                    if (increasedGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        int currentGold = townsMapAndGold.get(town) + increasedGold;
                        townsMapAndGold.put(town, currentGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", increasedGold,
                                town, currentGold);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (townsMapAndGold.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to: %n", townsMapAndGold.size());
            for (String s : townsMapAndPopulation.keySet()) {
                int gold = townsMapAndGold.get(s);
                int population = townsMapAndPopulation.get(s);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", s, population, gold);
            }
        }
    }
}
