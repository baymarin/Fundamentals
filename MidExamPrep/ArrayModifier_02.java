package Fundamentals.MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> arrayInt = Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "swap": {
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);

                    int intFromFirstIndex = arrayInt.get(firstIndex);

                    int intFromSecondIndex = arrayInt.get(secondIndex);

                    arrayInt.set(firstIndex, intFromSecondIndex);
                    arrayInt.set(secondIndex, intFromFirstIndex);

                }
                break;
                case "multiply": {
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    int firstNumber = arrayInt.get(firstIndex);
                    int multiplyBy = arrayInt.get(secondIndex);
                    arrayInt.set(firstIndex, firstNumber * multiplyBy);
                }
                break;
                case "decrease":
                    for (int i = 0; i < arrayInt.size(); i++) {
                        int num = arrayInt.get(i);
                        num = num - 1;
                        arrayInt.set(i, num);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < arrayInt.size() - 1; i++) {
            int currentNum = arrayInt.get(i);
            System.out.print(currentNum + ", ");
        }
        int lastNum = arrayInt.get(arrayInt.size() - 1);
        System.out.println(lastNum);
    }
}
