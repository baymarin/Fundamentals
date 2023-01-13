package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] treasure = input.split("\\|");
        List<String> treasureChest = new ArrayList<>();
        List<String> newTreasure = new ArrayList<>();
        for (String eachTreasure : treasure) {
            treasureChest.add(eachTreasure);
        }


        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split(" ", 2);
            switch (tokens[0]) {
                case "Loot":
                    String[] insert = tokens[1].split(" ");
                    for (int i = 0; i < insert.length; i++) {
                        if (treasureChest.contains(insert[i])) {
                            continue;
                        } else {
                            treasureChest.add(0, insert[i]);
                        }
                    }
                    break;
                case "Drop": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < treasureChest.size()) {

                        String currentTreasure = treasureChest.get(index);
                        treasureChest.remove(index);
                        treasureChest.add(currentTreasure);
                    }
                }
                break;
                case "Steal":
                    int index = Integer.parseInt(tokens[1]);

                    if (index > treasureChest.size()) {
                        index = treasureChest.size();
                    }

                    List<String> subList = treasureChest.subList(treasureChest.size() - index, treasureChest.size());

                    System.out.println(String.join(", ", subList));

                    treasureChest = treasureChest.subList(0, treasureChest.size() - index);

                    break;

            }
            command = scanner.nextLine();
        }

        if (!treasureChest.isEmpty()){
            int sumLength = 0;
            for (String s : treasureChest) {
                sumLength += s.length();
            }
            double averageGain = sumLength * 1.0 / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageGain);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}

