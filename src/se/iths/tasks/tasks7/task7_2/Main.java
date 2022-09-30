package se.iths.tasks.tasks7.task7_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> number = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            number.add(random.nextDouble());
        }

        for (Double doubleNumber: number) {
            System.out.println(doubleNumber);

        }
    }



}
