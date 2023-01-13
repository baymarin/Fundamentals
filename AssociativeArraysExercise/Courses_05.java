package Fundamentals.AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String course = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];
            if (map.containsKey(course)) {
                map.get(course).add(studentName);
            } else {
                map.putIfAbsent(course, new ArrayList<>());
                map.get(course).add(studentName);
            }

            command = scanner.nextLine();
        }

        for (String s : map.keySet()) {
            System.out.printf("%s: %d%n", s, sizeList(map.get(s)));
            List<String> names = map.get(s);
            for (String name : names) {
                System.out.printf("-- %s%n", name);
            }
        }
    }


    public static int sizeList(List<String> studentList) {
        int size = studentList.size();

        return size;
    }
}
