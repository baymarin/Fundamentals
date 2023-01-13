package Fundamentals.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftuniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> mapParkedCar = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ", 2);
            String command = input[0];

            if (command.equals("register")) {
                String[] nameAndCar = input[1].split(" ");
                String name = nameAndCar[0];
                String licensePlate = nameAndCar[1];
                if (mapParkedCar.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", mapParkedCar.get(name));
                } else {
                    mapParkedCar.putIfAbsent(name, licensePlate);
                    System.out.printf("%s registered %s successfully%n", name, mapParkedCar.get(name));
                }

            } else {
                String name = input[1];
                if (mapParkedCar.containsKey(name)) {
                    mapParkedCar.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }
        mapParkedCar.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));

    }
}
