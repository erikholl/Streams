package be.intecbrussel.exercise1and3;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private float weight;
    private float length;
    private Gender gender;

    public enum Gender {
        M { public String toString() { return "male"; }},
        F { public String toString() { return "female"; }},
        X { public String toString() { return "undefined"; }}
    }

    public Person() {
        this.firstName = "noFirstName";
        this.lastName = "noLastName";
        this.age = 0;
        this.weight = 0;
        this.length = 0;
        this.gender = Gender.X;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, float weight,
                  float length, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.length = length;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Float.compare(person.weight, weight) == 0 && Float.compare(person.length, length) == 0 && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, weight, length, gender);
    }

    @Override
    public String toString() {

//        return String.format("Name: %s %s Age: %d Weight: %.2f Length: %.2f",
//                             firstName, lastName, age, weight, length + "Sexe" +
//                                     ": " + sexe.toString());
        return "Name: " + firstName + " " + lastName + "\n" + "Age: " + age + "\n" + "Weight: " + weight + "\n" + "Length: " + length + "\n" + "Sexe: " + gender.toString() + "\n";

    }
}
