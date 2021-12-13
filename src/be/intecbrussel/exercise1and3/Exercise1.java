package be.intecbrussel.exercise1and3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {
        printStreamOfWords();
        printZeroToHundred();
        createAndPrintPersonArray();

    }

    private static void printStreamOfWords() {
        String[] words = {"Science", "is", "what", "we", "understand", "well"
                , "enough", "to", "explain", "to", "a", "computer", ",", "art", "is", "all", "the", "rest", "."};
        Stream.of(words)
                .forEach(System.out::println);
    }

    public static void printZeroToHundred() {
        IntStream.range(0, 100)
                .forEach(System.out::println);
    }

    public static void createAndPrintPersonArray() {
        Person person1 = new Person("Frey", "Goodman", 31, 68.5f, 1.68f,
                                    Person.Sexe.F);
        Person person2 = new Person("Mats", "Mudskip", 55, 93.2f, 1.90f,
                                    Person.Sexe.M);
        Person person3 = new Person("Jane", "Jenkins", 27, 73.1f, 1.71f,
                                    Person.Sexe.X);

//        Person[] persons = new Person[3];
        Person[] persons = {person1, person2, person3};

        Stream<Person> personStream = Stream.of(persons);
        personStream.forEach(System.out::println);

    }

}
