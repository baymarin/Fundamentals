package Fundamentals.AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String winningMaterial = "";
        boolean isReady = false;

        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();

        LinkedHashMap<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        HashMap<String, String> legendaryItems = new HashMap<>();
        legendaryItems.put("shards", "Shadowmourne");
        legendaryItems.put("fragments", "Valanyr");
        legendaryItems.put("motes", "Dragonwrath");

        while (!isReady) {
            String[] tokens = scanner.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < tokens.length; i += 2) {
                String material = tokens[i + 1];
                int quantity = Integer.parseInt(tokens[i]);

                if (materialsMap.containsKey(material)) {
                    int currentQty = materialsMap.get(material);
                    materialsMap.put(material, quantity + currentQty);

                    if (quantity + currentQty >= 250) {
                        winningMaterial = material;
                        isReady = true;
                        break;
                    }
                } else {
                    if (junkMap.containsKey(material)) {
                        int currentJunkQty = junkMap.get(material);
                        junkMap.put(material, currentJunkQty + quantity);
                    } else {
                        junkMap.put(material, quantity);
                    }
                }
            }
        }

        System.out.printf("%s obtained!%n", legendaryItems.get(winningMaterial));
        materialsMap.put(winningMaterial, materialsMap.get(winningMaterial) - 250);

        materialsMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
        junkMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}