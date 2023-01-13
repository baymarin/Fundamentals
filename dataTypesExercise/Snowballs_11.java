package Fundamentals.dataTypesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int topSnow = 0;
        int snowTime = 0;
        int snowQuality = 0;
        double powBest = 0;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int quality = (snowballSnow / snowballTime);
            double pow = Math.pow(quality, snowballQuality);
            if (pow > powBest) {
                topSnow = snowballSnow;
                snowTime = snowballTime;
                snowQuality = snowballQuality;
                powBest = pow;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", topSnow, snowTime, powBest, snowQuality);
    }
}
