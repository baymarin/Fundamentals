package Fundamentals.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Third_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ", 2);
            String action = tokens[0];

            switch (action) {
                case "Chat":
                    list.add(tokens[1]);
                    break;
                case "Delete":
                    list.remove(tokens[1]);
                    break;
                case "Edit":
                    String messageToEdit = tokens[1].split(" ")[0];
                    String editedVersion = tokens[1].split(" ")[1];
                    if (list.contains(messageToEdit)) {

                        for (int i = 0; i < list.size(); i++) {

                            if (list.get(i).equals(messageToEdit)) {
                                list.set(i, editedVersion);
                            }
                        }
                    }

                    break;
                case "Pin":
                    if (list.contains(tokens[1])) {
                        list.remove(tokens[1]);
                        list.add(tokens[1]);
                    }
                    break;
                case "Spam":
                    String[] spams = tokens[1].split(" ");

                    list.addAll(Arrays.asList(spams));
                    break;
            }

            input = scanner.nextLine();
        }
        list.forEach(System.out::println);
    }
}
