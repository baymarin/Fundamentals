package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class BackIn30Min_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHours = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = (startHours * 60) + startMinutes + 30;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        if (hours > 23){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
