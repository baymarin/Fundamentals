package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items[] = scanner.nextLine().split("!");
        List<String> itemsInList = new ArrayList<>();
        for (String item : items) {
            itemsInList.add(item);
        }
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] tokens = command.split(" ", 2);

            switch (tokens[0]) {
                case "Urgent":
                    if (!itemsInList.contains(tokens[1])) {
                        itemsInList.add(0, tokens[1]);
                    }
                    break;
                case "Unnecessary":
                    if (itemsInList.contains(tokens[1])) {
                        itemsInList.remove(tokens[1]);
                    }
                    break;
                case "Correct":
                    String oldItem = tokens[1].split(" ")[0];
                    String newItem = tokens[1].split(" ")[1];
                    if (itemsInList.contains(oldItem)) {
                        for (int i = 0; i < itemsInList.size(); i++) {
                            if (itemsInList.get(i).equals(oldItem)) {
                                itemsInList.remove(oldItem);
                                itemsInList.add(i, newItem);
                                break;
                            }
                        }
                    }
                    break;
                case "Rearrange":
                    if (itemsInList.contains(tokens[1])) {
                        itemsInList.remove(tokens[1]);
                        itemsInList.add(tokens[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", itemsInList));
    }
}
