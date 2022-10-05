package se.iths.stream;

import java.util.List;
import java.util.function.ToIntFunction;

public class StreamsAndExceptions {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "a");

        //Sum of numbers without exception
/*        numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);*/

        //Sum of numbers with exception
/*        try {
            var sum = numbers.stream()
                    .mapToInt(Integer::parseInt)
                    .sum();
        } catch (NumberFormatException e) {
            System.out.println("Error in input data");
        }*/

        //Sum of numbers with lambda and without method
/*        var sum = numbers.stream()
                .mapToInt(n -> {
                    try {
                        return Integer.parseInt(n);
                    } catch (NumberFormatException e) {
                        System.out.println("Error in data");
                        return 0;
                    }
                })
                .sum();
        System.out.println(sum);*/

        //Sum of numbers with lambda and method
        var sum = numbers.stream()
                .map(Integer::parseInt)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);
    }
    private static ToIntFunction<String> handleErrors() {
        return n -> {
            try {
                return Integer.parseInt(n);
            } catch (NumberFormatException e) {
                System.out.println("Error in data");
                return 0;
            }
        };
    }
}
