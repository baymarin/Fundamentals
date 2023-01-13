package Fundamentals.ExerciseArray;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        ArrayList<Integer> dnaSample = new ArrayList<>();

        int bestLength = 0;
        int secondToBestLength = 0;
        int bestIndex = 0;
        int secondToBestIndex = 0;
        while (!input.equals("Clone them!")) {
            List<Integer> sample = Arrays.stream(input.split("\\!"))
                    .map(Integer::parseInt).collect(Collectors.toList());
            for (int i = 0; i < arraySize; i++) {
            }

        }
    }
}
