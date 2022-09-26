package se.iths.tasks.tasks6.butik;

public class OnLand extends Vehicle {

    private int kmCounter;

    public OnLand(int weight, int price, Person owner, int kmCounter) {
        super(weight, price, owner);
        this.kmCounter = kmCounter;
    }

    public void drive(int distanceKm) {
        this.kmCounter = this.kmCounter + distanceKm;
        System.out.println(this.kmCounter);
    }
}