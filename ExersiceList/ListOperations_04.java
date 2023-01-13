package Fundamentals.ExersiceList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                inputList.add(numberToAdd);
            } else if (tokens[0].equals("Insert")) {
                int numberToInsert = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (isValidIndex(index, inputList)) {
                    inputList.add(index, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[0].equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (isValidIndex(index, inputList)) {
                    inputList.remove(index);
                } else {
                    System.out.println("Invalid index");

                }
            } else if (tokens[0].equals("Shift")) {
                int shiftTimes = Integer.parseInt(tokens[2]);
                if (tokens[1].equals("left")) {
                    for (int i = 0; i < shiftTimes; i++) {
                        int temp = inputList.get(0);
                        for (int j = 0; j < inputList.size() - 1; j++) {
                            int nextElement = inputList.get(j + 1);
                            inputList.set(j, nextElement);
                        }
                        inputList.set(inputList.size() - 1, temp);
                    }
                } else {
                    for (int i = 0; i < shiftTimes; i++) {
                        int temp = inputList.get(inputList.size() - 1);
                        for (int j = inputList.size() - 1; j > 0; j--) {
                            int nextElement = inputList.get(j - 1);
                            inputList.set(j, nextElement);
                        }
                        inputList.set(0, temp);
                    }
                }
            }
            command = scanner.nextLine();
        }
        printList(inputList);
    }

    public static void printList(List<Integer> list) {
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }

    public static boolean isValidIndex(int index, List<Integer> array) {
        if (index >= 0 && index < array.size()) {
            return true;
        } else {
            return false;
        }
    }
}