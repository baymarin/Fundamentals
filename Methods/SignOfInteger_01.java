package Fundamentals.Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNum (number);
    }
    public static void printNum (int number){
        if (number  > 0){
            System.out.printf("The number %d is positive.", number);
        }else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        }else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
