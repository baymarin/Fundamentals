package Fundamentals.ExersiceList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Delete")) {
                int numberToDelete = Integer.parseInt(tokens[1]);
                for (int i = 0; i < inputList.size(); i++) {
                    if (inputList.get(i) == numberToDelete) {
                        inputList.remove(i);
                        i--;
                    }
                }
            } else if (tokens[0].equals("Insert")) {
                int valueToInsert = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                inputList.add(index, valueToInsert);
            }
            command = scanner.nextLine();
        }
        printIntegerList(inputList);
    }

    public static void printIntegerList(List<Integer> printList) {
        for (Integer item : printList) {
            System.out.print(item + " ");

        }
    }
}
