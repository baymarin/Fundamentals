package Fundamentals.ExersiceList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (firstHand.size() > 0 && secondHand.size() > 0) {
            if (firstHand.get(0) > secondHand.get(0)) {
                firstHand.add(secondHand.get(0));
                firstHand.add(firstHand.get(0));
                secondHand.remove(0);
                firstHand.remove(0);
            } else if (secondHand.get(0) > firstHand.get(0)) {
                secondHand.add(firstHand.get(0));
                secondHand.add(secondHand.get(0));
                firstHand.remove(0);
                secondHand.remove(0);
            } else {
                firstHand.remove(0);
                secondHand.remove(0);
            }
        }
        int sum = 0;
        String winner = "";
        if (firstHand.size() > 0) {
            for (int i = 0; i < firstHand.size(); i++) {
                sum += firstHand.get(i);
                winner = "First player wins! Sum: ";
            }
        } else {
            for (int i = 0; i < secondHand.size(); i++) {
                sum += secondHand.get(i);
                winner = "Second player wins! Sum: ";
            }
        }
        System.out.println(winner + sum);
    }
}
