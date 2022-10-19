package se.iths.tasks.tasks9;


import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        withStream();
        forLoop();
    }

    private static void withStream() {


        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                //mapToObj(
                // delbart med 3
                //      ifTRUE (delbart med 5
                //              ifTRUE "FizzBuzz"
                //              ifFALSE "Fizz")
                //      ifFALSE (delbart med 5
                //              ifTRUE "Buzz"
                //              ifFALSE i))


                .forEach(System.out::println);

    }

    private static void forLoop() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

}
