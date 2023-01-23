package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        if (studentsCount == 0){
            System.out.println("Time needed: 0h.");
            return;
        }

        while (studentsCount > 0) {
            hours++;
            if (hours % 4 == 0) {
                continue;
            }
            if (studentsCount > 0) {
                studentsCount -= firstEmployee;
            }
            if (studentsCount > 0) {
                studentsCount -= secondEmployee;
            }
            if (studentsCount > 0) {
                studentsCount -= thirdEmployee;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
