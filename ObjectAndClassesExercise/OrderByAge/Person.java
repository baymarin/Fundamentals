package Fundamentals.ObjectAndClassesExercise.OrderByAge;

public class Person {
    private String firstName;
    private String id;
    private int age;

    public Person(String firstName, String id, int age) {
        this.firstName = firstName;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        String result = String.format("%s with ID: %s is %d years old.", firstName, id, age);
        return result;
    }
}
