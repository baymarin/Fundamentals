package Fundamentals.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> backwardNumber = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i--;
            }
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            backwardNumber.add(numbers.get(i));

        }
        if (backwardNumber.isEmpty()) {
            System.out.println("empty");
        } else {
            printList(backwardNumber);
        }
    }

    public static void printList(List<Integer> lines) {
        for (Integer item : lines) {
            System.out.print(item + " ");

        }
    }
}
