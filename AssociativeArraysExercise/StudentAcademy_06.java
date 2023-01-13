package Fundamentals.AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsWhitGrade = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsWhitGrade.containsKey(name)) {
                studentsWhitGrade.put(name, new ArrayList<>());
                studentsWhitGrade.get(name).add(grade);
            } else {
                studentsWhitGrade.get(name).add(grade);
            }
        }
        LinkedHashMap<String, Double> studentsAverage = new LinkedHashMap<>();
        for (String s : studentsWhitGrade.keySet()) {
            if (average(studentsWhitGrade.get(s)) >= 4.5) {
                studentsAverage.put(s, average(studentsWhitGrade.get(s)));
            }
        }
        studentsAverage.entrySet().forEach(s -> System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue()));
    }

    public static double average(List<Double> grades) {
        double sumGrade = 0;
        for (Double grade : grades) {
            sumGrade += grade;
        }
        return sumGrade / grades.size();
    }
}
