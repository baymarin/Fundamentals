package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            int currentNum = Integer.parseInt(values[i]);
            numbers.add(currentNum);
        }
        int iterationCount = numbers.size() / 2;
        for (int i = 0; i < iterationCount; i++) {
            int lastIndex = numbers.size() - 1;
            int currentSum = numbers.get(i) + numbers.get(lastIndex);
            numbers.remove(lastIndex);
            numbers.set(i, currentSum);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }
}
