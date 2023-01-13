package Fundamentals.dataTypesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int originalPower = power;
        while (power >= distance) {
            power -= distance;
            counter++;

            if (power == (originalPower * 0.5) && exhaustionFactor != 0) {
                if (power / exhaustionFactor >= 0) {
                    power = power / exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(counter);
    }
}
