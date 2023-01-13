package Fundamentals.ExersiceList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        ArrayList<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] eachArray = input[i].trim().split("\\s+");
            for (String element : eachArray) {
                result.add(element);
            }
            result.remove("");
        }
        System.out.println(String.join(" ", result));
    }

}
