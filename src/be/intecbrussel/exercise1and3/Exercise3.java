package be.intecbrussel.exercise1and3;

import java.util.stream.Stream;

public class Exercise3 {

    private static Person person1 = new Person("Thor", "Stillwait", 33, 115.4f,
                                          2.02f,
                                Person.Sexe.M);
    private static Person person2 = new Person("Ben", "Blissful", 17, 71.7f,
                                             1.83f,
                                Person.Sexe.M);
    private static Person person3 = new Person("Issa", "Instupulous", 88, 71.0f,
        1.75f, Person.Sexe.M);
    private static Person person4 = new Person("Steffi", "Fabfluff", 49, 140.6f,
                                        1.61f, Person.Sexe.F);

    private static Person[] persons = {person1, person2, person3, person4};

    public static void main(String[] args) {
        streamToArray();
        // i do not understand why we're doing this: we have array, make a
        // stream of it, and convert it back into array. weird exercise. i
        // guess it makes sense if we do some other adaptations on the stream
        // firsdt before we convert back to array. Also, what can we now
        // actually do with this array? It gives void, it does not return
        // anything. Other methods?

    }

    public static void streamToArray() {
        Person[] pArr = Stream.of(persons)
                .toArray(Person[]::new);

    }
}
