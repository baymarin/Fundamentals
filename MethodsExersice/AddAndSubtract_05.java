package Fundamentals.MethodsExersice;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        System.out.println(solutionOfAddAndSubtract(firstNum, secondNum, thirdNum));
    }

    public static int solutionOfAddAndSubtract(int first, int second, int third) {
        int sum = first + second;

        return sum - third;
    }
}
