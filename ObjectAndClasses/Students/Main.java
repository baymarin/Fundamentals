package Fundamentals.ObjectAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            int age = Integer.parseInt(tokens[2]);
            Student found = isStudentExisting(students, tokens[0], tokens[1]);

            if (found != null) {
                students.remove(found);
            }

            Student student = new Student(tokens[0], tokens[1], age, tokens[3]);
            students.add(student);
            input = scanner.nextLine();

        }
        String city = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", current.getFirstName(), current.getSecondName(), current.getAge());
            }
        }

    }


    public static Student isStudentExisting(List<Student> students, String firstName, String secondName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return student;
            }
        }
        return null;
    }
}
