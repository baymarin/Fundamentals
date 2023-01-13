package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> leftList = readList(scanner);
        List<Integer> rightList = readList(scanner);
        List<Integer> theNew = new ArrayList<>();
        int i = 0;
        while (i < leftList.size() && i < rightList.size()) {
            theNew.add(leftList.get(i));
            theNew.add(rightList.get(i));

            i++;
        }
        if (i < leftList.size()) {
            addLeftovers(theNew, leftList, i);
        } else if (i < rightList.size()) {
            addLeftovers(theNew, rightList, i);
        }
        for (Integer number : theNew) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> readList(Scanner scanner) {
        List<Integer> result = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        return result;
    }

    public static void addLeftovers(List<Integer> result, List<Integer> list, int i) {
        for (int j = i; j < list.size(); j++) {
            result.add(list.get(j));
        }
    }
}

