package Fundamentals.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (map.containsKey(command)) {
                int valueOfMap = map.get(command);
                valueOfMap += quantity;
                map.put(command, valueOfMap);
            } else {
                map.putIfAbsent(command, quantity);
            }
            command = scanner.nextLine();
        }

        map.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
