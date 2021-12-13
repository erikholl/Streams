package be.intecbrussel;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2 {

    private static final int[] intArr = {4, 67, 98, 3, 22, 101, 68, 9, 13, 46,
            256};
    private static final int[] intArr2 = {1, 2, 3, 4}; // sum of powered2 = 30
    private static final String[] words = {"Science", "is", "what", "we", "understand", "well"
            , "enough", "to", "explain", "to", "a", "computer", ",", "art",
            "is", "all", "the", "rest", "."};

    public static void main(String[] args) {
        amountOfNumbers();
        maximum();
        minimum();
        average();
        sum();
        sumOfPoweredToTwo();
        separatedByDotComma();
    }

    public static void amountOfNumbers() {
        int amount = (int) IntStream.of(intArr)
                .count();
        System.out.println(amount);
    }

    public static void maximum() {
        OptionalInt maximum = IntStream.of(intArr)
                .max();
        if (maximum.isPresent()) {
            System.out.println(maximum.getAsInt());
        } else
            System.out.println("no result");
    }

    public static void minimum() {
        OptionalInt minimum = IntStream.of(intArr)
                .min();
        if (minimum.isPresent()) {
            System.out.println(minimum.getAsInt());
        } else
            System.out.println("no result");
    }

    public static void average() {
        OptionalDouble average = IntStream.of(intArr)
                .average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else
            System.out.println("no result");
    }

    public static void sum() {
        int sum = IntStream.of(intArr)
                .sum();
        System.out.println(sum);
    }

    public static void sumOfPoweredToTwo() {
        int sumOfPowered = IntStream.of(intArr2)
                .reduce(0, (acc, e) -> acc + (e * e));
        System.out.println(sumOfPowered);
    }

    public static void separatedByDotComma() {
       String separated = Stream.of(words)
               .reduce(";", (acc, e) -> acc + e + ";");
        System.out.println(separated);
    }

}
