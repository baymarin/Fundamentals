package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        String everyThing = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);
        System.out.println(everyThing);
    }
}
