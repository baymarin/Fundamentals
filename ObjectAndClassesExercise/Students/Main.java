package Fundamentals.ObjectAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String firstName = input[0];
            String secondName = input[1];
            double grade = Double.parseDouble(input[2]);
            Student newStudent = new Student(firstName, secondName, grade);
            students.add(newStudent);
        }
        //students.sort(Comparator.comparing(Student::getGrade).reversed());
        students.stream().sorted(Comparator.comparing(Student::getGrade).reversed())
                .forEach(s -> System.out.println(s.toString()));
    }
}
