package Fundamentals.AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        final String END_COMMAND = "End";

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> companyUsers = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals(END_COMMAND)) {
            String[] tokens = command.split(" -> ");
            String inputCompanyName = tokens[0];
            String inputCompanyId = tokens[1];

            ArrayList<String> currentCompanyIds;
            if (companyUsers.containsKey(inputCompanyName)) {
                currentCompanyIds = companyUsers.get(inputCompanyName);

                if (currentCompanyIds.contains(inputCompanyId)) {
                    command = scanner.nextLine();
                    continue;
                }
            } else {
                currentCompanyIds = new ArrayList<>();
            }

            currentCompanyIds.add(inputCompanyId);
            companyUsers.put(inputCompanyName, currentCompanyIds);

            command = scanner.nextLine();
        }

        companyUsers.forEach((key, value) -> {
            System.out.println(key);
            Arrays.stream(value.toArray()).forEach(user -> {
                System.out.printf("-- %s%n", user);
            });
        });
    }
}
