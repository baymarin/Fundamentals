package Fundamentals.ObjectAndClassesExercise.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] person = scanner.nextLine().split(" ");
            int age = Integer.parseInt(person[1]);
            String name = person[0];
            if (age > 30) {
                Person newPerson = new Person(name, age);
                people.add(newPerson);
            }
        }


        people.stream().
                forEach(p -> System.out.println(p.toString()));
    }
}
