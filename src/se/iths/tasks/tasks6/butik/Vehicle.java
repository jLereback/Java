package se.iths.tasks.tasks6.butik;


public abstract class Vehicle {
    public int weight;
    public int price;
    public Person owner;

    public Vehicle(int weight, int price, Person owner) {
        this.weight = weight;
        this.price = price;
        this.owner = owner;
    }

    public void printOwner() {
        System.out.println("The owner of the vehicle is named " + this.owner.name);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }

}
