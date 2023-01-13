package Fundamentals.ObjectAndClassesExercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Person> people = new ArrayList<>();
        while (!input.equals("End")) {
            String[] currentPerson = input.split(" ");
            String name = currentPerson[0];
            String id = currentPerson[1];
            int age = Integer.parseInt(currentPerson[2]);
            Person eachPerson = new Person(name, id, age);
            people.add(eachPerson);
            input = scanner.nextLine();
        }
        people.stream().sorted(Comparator.comparing(Person::getAge))
                .forEach(p -> System.out.println(p.toString()));
    }
}
