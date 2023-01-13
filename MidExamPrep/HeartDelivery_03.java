package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("@");
        List<Integer> inputInList = new ArrayList<>();

        for (String s : input) {
            inputInList.add(Integer.parseInt(s));
        }
        int currentIndex = 0;
        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            int length = Integer.parseInt(command.split(" ")[1]);
            currentIndex = length + currentIndex;
            if (currentIndex >= inputInList.size()) {
                currentIndex = 0;
            }
            if (inputInList.get(currentIndex) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
                command = scanner.nextLine();
                continue;
            }
            int currentHouse = inputInList.get(currentIndex) - 2;
            inputInList.set(currentIndex, currentHouse);
            if (currentHouse == 0) {
                System.out.printf("Place %d has Valentine's day.%n", currentIndex);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        int houseCounter = 0;
        for (Integer house : inputInList) {
            if (house > 0) {
                houseCounter++;
            }
        }
        if (houseCounter > 0){
            System.out.printf("Cupid has failed %d places.", houseCounter);
        }else {
            System.out.println("Mission was successful.");
        }
    }
}
