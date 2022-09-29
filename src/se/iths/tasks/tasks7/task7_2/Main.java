package se.iths.tasks.tasks7.task7_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Random> number = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            number.add(new Random());
        }

        for (Random doubleNumber: number) {
            System.out.println(doubleNumber.nextDouble());

        }
    }
}
