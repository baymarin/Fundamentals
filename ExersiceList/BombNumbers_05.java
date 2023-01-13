package Fundamentals.ExersiceList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] bomb = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(bomb[0]);
        int power = Integer.parseInt(bomb[1]);
        while (inputList.contains(bombNumber)) {
            int bombIndex = inputList.indexOf(bombNumber);

            int leftBound = Math.max(bombIndex - power, 0);
            int rightBound = Math.min(bombIndex + power, inputList.size() - 1);
            for (int i = rightBound; i >= leftBound; i--) {
                inputList.remove(i);
            }
        }
        int sum = 0;
        for (Integer number : inputList) {
            sum += number;
        }
        System.out.println(sum);
    }
}

