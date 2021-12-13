package be.intecbrussel;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo3 {

    public static void main(String[] args) {

        // consuming final 'bewerking
        IntStream.range(0, 10)
                .forEach(e -> System.out.println(e)); // nothing
        // is returned but something is being done. Example of final
        // bewerking. forEach is consuming end bewerking

        // reducing final bewerking - reducing to 1 result
        int a = IntStream.range(0, 10)
                .sum();

        int product = IntStream.range(1, 10)
                .reduce(1, (acc, e) -> acc * e);
        // 1: acc = 1 (start, e = 1) -> result is 1
        // 2: acc becomes result = 1, e = 2 -> result is 2
        // 3: acc becomes result = 2, e = 3 -> result is 6
        // 4: acc becomes result = 6, e = 4 -> result is 24
        // and so on...
        System.out.println("product: " + product);

        String sentence = Stream.of("this", "day", "potato")
                .reduce("My sentence is: ", (acc, e) -> acc.concat(e.concat(
                        " ")));
        System.out.println(sentence);

        // collecting end bewerking ( for instance toArray)
        int[] arr = IntStream.range(0, 10)
                .toArray();

    }
}
