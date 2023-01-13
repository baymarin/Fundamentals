package Fundamentals.ObjectsMoreExersice.CompanyRoster_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee> allEmployees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            double salary = Double.parseDouble(input[1]);
            int age = Integer.parseInt(input[5]);
            Employee currentEmployee = new Employee(input[0], salary, input[2], input[3], input[4], age);
            allEmployees.add(currentEmployee);
        }


    }
}
