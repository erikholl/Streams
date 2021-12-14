package be.intecbrussel.exercise1and3;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo4 {

    private static Person person1 = new Person("Thor", "Stillwait", 33, 115.4f,
            2.02f,
            Person.Gender.M);
    private static Person person2 = new Person("Ben", "Blissful", 17, 71.7f,
            1.83f,
            Person.Gender.M);
    private static Person person3 = new Person("Issa", "Instupulous", 88, 71.0f,
            1.75f, Person.Gender.M);
    private static Person person4 = new Person("Steffi", "Fabfluff", 49, 140.6f,
            1.61f, Person.Gender.F);

    private static Person[] persons = {person1, person2, person3, person4};

    public static void main(String[] args) {
        filterPerson();
    }

    public static void filterPerson() {
        Stream.of(persons)
                .distinct()
                .sorted(Comparator.comparing(Person::getLastName))
                .filter(person -> person.getFirstName().contains("e"))
                .filter(person -> person.getLastName().contains("i") || person.getLastName().contains("u"))
                .forEach(System.out::println);
    }
}
