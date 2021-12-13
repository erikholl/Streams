package be.intecbrussel;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {
        rangeMethod();
        generateMethod();
        iterateMethod();

    }

    private static void rangeMethod() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
//            System.out.println("potato");
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


        // Stream<T> | IntStream | LongStream | DoubleStream
        int streamSum = IntStream.range(0, 10)
//                .forEach(e -> System.out.println("potato"))
                .filter(e -> e % 2 == 0)
//                .map(e -> e % 2 != 0 ? e + 1 : e)
                .sum();

        System.out.println(streamSum);
    }

    private static void generateMethod() {
        Stream.generate(() -> new Random().nextInt(50))
                .limit(3) // without limit stream will generate infinitely
                .forEach(System.out::println);
    }

    private static void iterateMethod() { // very handy as replacements for-loop
        IntStream.iterate(1, i -> i * 2)
                .limit(9)
                .forEach(System.out::println);
    }
}
