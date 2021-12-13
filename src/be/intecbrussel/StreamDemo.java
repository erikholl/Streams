package be.intecbrussel;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
//        withoutStreams();
        withStreams();

    }

    private static void withStreams() {
        String[] words = {"This", "day", "is", "a", "good", "day"};

        // Option 1, use a variable stream:
        Stream<String> myStream = Stream.of(words)
                .filter(word -> word.length() >= 3);

        myStream.forEach(System.out::println); // you can only use the result
        // under the variable for 1 time

        // convert array to a stream, filter and print
        // Option 2, method chaining
        Stream.of(words)
                .filter(word -> word.length() >= 3)
                .forEach(System.out::println);

        // how can we convert the stream back to a new array?
        String[] wordsEqualOrLongerThanThreeLetters = Stream.of(words)
                .filter(word -> word.length() >= 3)
                .toArray(String[]::new); // constructor reference
        // for each method we're using on the stream, we're implementing a
        // version of a functional interface (for filtyer it is Predicate)

        Predicate<String> myPredicate = word -> word != null;
        //


        for (String word : wordsEqualOrLongerThanThreeLetters) {
            System.out.println(word);
        }
        // or
        Stream.of(wordsEqualOrLongerThanThreeLetters)
                .forEach(System.out::println);
    }

    private static void withoutStreams() {
        String[] words = {"This", "day", "is", "a", "good", "day"};

        String[] wordsEqualOrLongerThanThreeLetters = new String[5];
        int index = 0;

        for (String word : words) {
            if (word.length() >= 3) {
                wordsEqualOrLongerThanThreeLetters[index] = word;
                index++;
            }
        }

        for (String word : wordsEqualOrLongerThanThreeLetters) {
            if (word != null) {
                System.out.println(word);
            }
        }

    }

}
