
package Fundamentals.ObjectAndClasses.Students;

public class Student {
    private String firstName;
    private String secondName;
    private int age;
    private String town;

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getAge() {
        return this.age;
    }

    public String getTown() {
        return this.town;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Student(String firstName, String secondName, int age, String town) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.town = town;
    }
}
