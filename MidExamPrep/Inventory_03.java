package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        ArrayList<String> items = new ArrayList<>(Arrays.asList(input));
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("Craft!")) {
            String[] command = inputCommand.split(" - ");
            switch (command[0]) {
                case "Collect": {
                    String item = command[1];
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                }
                case "Drop": {
                    String item = command[1];
                    items.remove(item);
                    break;
                }
                case "Combine Items":
                    String[] itemsToCombine = command[1].split(":");
                    String oldItem = itemsToCombine[0];
                    String newItem = itemsToCombine[1];
                    for (int i = 0; i < items.size(); i++) {
                        String currentItem = items.get(i);
                        if (currentItem.equals(oldItem)) {
                            items.add(i + 1, newItem);
                        }
                    }
                    break;
                case "Renew":
                    String item = command[1];
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
            }
            inputCommand = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
