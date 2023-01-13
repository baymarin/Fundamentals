package Fundamentals.Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumAdjacent_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        List<Double> numbers = Arrays.stream(array).map(Double::parseDouble).toList();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                double sum = numbers.get(i) * 2;
                numbers.remove(i);
                numbers.set(i, sum);
                i = -1;
            }
        }
        System.out.println(joinElementByDelimiter(numbers, " "));
    }

    public static String joinElementByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }        return output;


    }
}

