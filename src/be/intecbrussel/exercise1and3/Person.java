package be.intecbrussel.exercise1and3;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private float weight;
    private float length;
    private Sexe sexe;

    public enum Sexe {
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
        this.sexe = Sexe.X;
    }

    public Person(String firstName, String lastName, int age, float weight,
                  float length, Sexe sexe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.length = length;
        this.sexe = sexe;
    }

    @Override
    public String toString() {

//        return String.format("Name: %s %s Age: %d Weight: %.2f Length: %.2f",
//                             firstName, lastName, age, weight, length + "Sexe" +
//                                     ": " + sexe.toString());
        return "Name: " + firstName + " " + lastName + "\n" + "Age: " + age + "\n" + "Weight: " + weight + "\n" + "Length: " + length + "\n" + "Sexe: " + sexe.toString() + "\n";

    }
}
