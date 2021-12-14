package be.intecbrussel.exercise1and3;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo5 {

    public static void main(String[] args) {

        Person[] pArr = {
                new Person("Jean-Pierre", 55),
                new Person("Jean-Ali", 53),
                new Person("Jean-Ali", 41),
                new Person("Jean-Ali", 24),
                new Person("Jean-Zuhur", 19),
                new Person("Jean-Marie", 18),
                new Person("Jean-Renaux", 26),
                new Person("Jean-Ali", 89),
                new Person("Jean-Erik", 71),
                new Person("Jean-Jacques", 61),
                new Person("Jean-Ali-with-moustache", 34),
                new Person("Jean-Ali-without-moustache", 32),
                new Person("Jean-Luc", 64),
                new Person("Jean-Louis", 56),
                new Person("Jean-Manuel", 7),
                new Person("Jean-Petit", 13),
                new Person("Jean-Jean", 43),
        };

        OptionalDouble averageAge = Stream.of(pArr)
                .distinct() // again on top! important, as if we do it after
                // the map method, it could be we filter out duplicates based
                // on age only; not on person anymore.
                .mapToInt(person -> person.getAge())
                .average();
        System.out.println(averageAge.isPresent() ? averageAge.getAsDouble():
                "no result");

        Stream.of(pArr)
                .map(person -> new Random())
                .forEach(System.out::println);

        Stream.of(pArr)
                .distinct()
                .map(person -> person.getFirstName()) // note this again can
                // be replaced with a method reference.
                .forEach(System.out::println);

        Stream.of(pArr)
                .distinct()
                .mapToInt(person -> person.getAge())
                .peek(System.out::println) // peek is very handy to check
                // what is going on on the stream, are the values okay for
                // the treatment that you want to give it
                .forEach(System.out::println);
    }
}
