package Fundamentals.Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        printGrade(grade);
    }

    public static void printGrade(double gradeInWords) {
        if (gradeInWords >= 2.00 && gradeInWords < 3) {
            System.out.println("Fail");
        } else if (gradeInWords < 3.50) {
            System.out.println("Poor");
        } else if (gradeInWords < 4.50) {
            System.out.println("Good");
        } else if (gradeInWords < 5.50) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
