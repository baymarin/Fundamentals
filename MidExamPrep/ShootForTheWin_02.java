package Fundamentals.MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> arrayAsList = new ArrayList<>();
        int counter = 0;

        for (int i : inputArr) {
            arrayAsList.add(i);
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int indexToShoot = Integer.parseInt(command);
            if (indexToShoot >= 0 && indexToShoot < arrayAsList.size() && arrayAsList.get(indexToShoot) != -1) {
                counter++;
                int currentTarget = arrayAsList.get(indexToShoot);
                for (int i = 0; i < arrayAsList.size(); i++) {
                    if (arrayAsList.get(i) == -1) {
                        continue;
                    }
                    if (currentTarget < arrayAsList.get(i)) {
                        arrayAsList.set(i, arrayAsList.get(i) - currentTarget);
                    } else {
                        arrayAsList.set(i, arrayAsList.get(i) + currentTarget);
                    }
                }
                arrayAsList.set(indexToShoot, -1);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", counter);
        for (Integer index : arrayAsList) {
            System.out.print(index + " ");
        }
    }
}
