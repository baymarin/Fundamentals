package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");
            String comparison = tokens[1];
            switch (tokens[0]) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(tokens[1]);
                    containNumber(number, numberToCheck);
                    break;
                case "Filter":
                    int indexToCompareWhit = Integer.parseInt(tokens[2]);
                    switch (tokens[0]) {
                        case "Filter":
                            System.out.println(filterTheNumbersBelowAndAboveIndex(number,
                                    indexToCompareWhit, comparison).toString().
                                    replaceAll("[\\[\\],]", ""));
                    }
                    break;
            }
            switch (tokens[1]) {
                case "even":
                    System.out.println(evenNumbersInTheList(number).toString()
                            .replaceAll("[\\[\\],]", "") + " ");
                    break;
                case "odd":
                    System.out.println(oddNumbersInTheList(number).toString()
                            .replaceAll("[\\[\\],]", "") + " ");
                    break;
                case "sum":
                    System.out.println(sumAllTheNumbersInTheList(number));
                    break;

            }
        }
    }

    public static void containNumber(List<Integer> list, int inputNum) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {

            int currentNum = list.get(i);
            if (currentNum == inputNum) {
                System.out.println("Yes");
            } else {
                counter++;
            }
            if (counter == list.size()) {
                System.out.println("No such number");
            }
        }
    }

    public static List<Integer> evenNumbersInTheList(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenNumbers.add(list.get(i));
            }
        }
        return evenNumbers;
    }

    public static List<Integer> oddNumbersInTheList(List<Integer> list) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddNumbers.add(list.get(i));
            }
        }
        return oddNumbers;
    }

    public static int sumAllTheNumbersInTheList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static List<Integer> filterTheNumbersBelowAndAboveIndex(List<Integer> list, int inputNum, String comparison) {
        List<Integer> numberBelowIndex = new ArrayList<>();

        switch (comparison) {
            case ">=":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) >= inputNum) {
                        numberBelowIndex.add(list.get(i));
                    }
                }
                return numberBelowIndex;
            case ">":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) > inputNum) {
                        numberBelowIndex.add(list.get(i));
                    }
                }
                return numberBelowIndex;
            case "<":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) < inputNum) {
                        numberBelowIndex.add(list.get(i));
                    }
                }
                return numberBelowIndex;
            case "<=":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) <= inputNum) {
                        numberBelowIndex.add(list.get(i));
                    }
                }

        }
        return numberBelowIndex;
    }
}
