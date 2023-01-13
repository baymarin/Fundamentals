package Fundamentals.ExersiceList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> endListWhitNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            if (input[1].equals("is") && input[2].equals("going!")) {
                if (endListWhitNames.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    endListWhitNames.add(name);
                }
            } else {
                if (!endListWhitNames.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    endListWhitNames.remove(name);
                }

            }
        }

        printNames(endListWhitNames);
    }

    public static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
