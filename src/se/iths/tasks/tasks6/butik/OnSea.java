package se.iths.tasks.tasks6.butik;

import java.util.Random;

public class OnSea extends Vehicle {
    public OnSea(int weight, int price, Person owner) {
        super(weight, price, owner);
    }

    public void go() {
        double lat = new Random().nextDouble();
        double lon = new Random().nextDouble();
        double latitude = lat * (64.0 - 57.0) + 57;
        double longitude = lon * (4.0 - 0.0);
        System.out.println("The new GPS-coordinates is:");
        System.out.printf("Latitude: %.6f\n", latitude);
        System.out.printf("Longitude: %.6f\n", longitude);
    }
}
