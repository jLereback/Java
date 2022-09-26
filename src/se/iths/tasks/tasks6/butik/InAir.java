package se.iths.tasks.tasks6.butik;

import java.util.Random;

public class InAir extends Vehicle {
    public InAir(int weight, int price, Person owner) {
        super(weight, price,owner);
    }

    public void fly(boolean isFlying) {
        if (isFlying) {
            double alt = new Random().nextDouble();
            double altitude = alt * (10000.0 - 57.0) + 57;
            System.out.println("The vehicle is flying");
            System.out.printf("The altitude is %.0fm\n", altitude);
        }
        else
            System.out.println("The vehicle is safe on the ground");
    }
}
