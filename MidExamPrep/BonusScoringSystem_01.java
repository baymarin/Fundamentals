package Fundamentals.MidExamPrep;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        int bestStudent = Integer.MIN_VALUE;
        if (lectures == 0 || students == 0){
            System.out.println("Max Bonus: 0.");
            System.out.println("The student has attended 0 lectures.");
            return;
        }


        for (int i = 0; i < students; i++) {
            int attendanceEachStudent = Integer.parseInt(scanner.nextLine());
            if (attendanceEachStudent >= bestStudent) {
                bestStudent = attendanceEachStudent;
            }
        }
        double eachStudent = 1.0 * bestStudent / lectures;
        int endBonus = 5 + bonus;
        double maxBonus = eachStudent * endBonus;

        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", Math.ceil(maxBonus), bestStudent);
    }
}
