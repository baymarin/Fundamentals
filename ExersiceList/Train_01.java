package Fundamentals.ExersiceList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                train.add(numberToAdd);
            } else {
                for (int i = 0; i < train.size(); i++) {
                    int newPassenger = Integer.parseInt(tokens[0]);
                    if (newPassenger + train.get(i) <= maxCapacity) {
                        train.set(i, newPassenger + train.get(i));
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        printListIntegers(train);

    }

    public static void printListIntegers(List<Integer> printList) {
        for (Integer item : printList) {
            System.out.print(item + " ");

        }
    }
}
