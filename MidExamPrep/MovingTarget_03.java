package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> inputAsList = new ArrayList<>();
        for (int i : inputArr) {
            inputAsList.add(i);
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String action = command.split(" ")[0];
            int indexToAct = Integer.parseInt(command.split(" ")[1]);
            int valueToAct = Integer.parseInt(command.split(" ")[2]);
            switch (action) {
                case "Shoot":
                    if (indexToAct >= 0 && indexToAct < inputAsList.size()) {
                        int currentTarget = inputAsList.get(indexToAct);
                        currentTarget -= valueToAct;
                        if (currentTarget > 0) {
                            inputAsList.set(indexToAct, currentTarget);
                        } else {
                            inputAsList.remove(indexToAct);
                        }
                    }
                    break;
                case "Add":
                    if (indexToAct >= 0 && indexToAct < inputAsList.size()) {
                        inputAsList.add(indexToAct, valueToAct);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (indexToAct - valueToAct >= 0 && indexToAct + valueToAct < inputAsList.size()) {
                        int startIndex = indexToAct - valueToAct;
                        int endIndex = indexToAct + valueToAct;
                        inputAsList.subList(startIndex, endIndex + 1).clear();
                    } else {
                        System.out.println("Strike missed!");

                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print(Arrays.toString(new List[]{inputAsList}).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "|"));
    }
}
