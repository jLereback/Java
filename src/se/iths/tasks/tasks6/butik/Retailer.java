package se.iths.tasks.tasks6.butik;

import java.sql.SQLOutput;

public class Retailer extends Person{
    public Retailer(String name, int age, int bankBalance) {
        super(name, age, bankBalance);
    }

    @Override
    public void buyVehicle(Vehicle vehicle) {

        System.out.println(vehicle.owner.name + " äger fordonet och har " + vehicle.owner.bankBalance + " på kontot");
        System.out.println(this.name + " har " + this.bankBalance + " på kontot och köper fordonet från " + vehicle.owner.name + " för " + vehicle.price);


        vehicle.owner.bankBalance = vehicle.owner.bankBalance + vehicle.price;
        this.bankBalance = this.bankBalance - vehicle.price;
        System.out.println("Nu har " + vehicle.owner.name + " " + vehicle.owner.bankBalance + " på kontot");


        vehicle.owner = this;
        System.out.println("Nu äger " + vehicle.owner.name + " fordonet och har " + vehicle.owner.bankBalance + " på kontot");

    }

    @Override
    public void sellVehicle(Vehicle vehicle, Buyer buyer) {

        System.out.println(this.name + " äger fordonet och har " + this.bankBalance + " på kontot");
        System.out.println(buyer.name + " har " + buyer.bankBalance + " på kontot och köper fordonet från " + this.name + " för " + vehicle.price);

        this.bankBalance = this.bankBalance + vehicle.price;
        buyer.bankBalance = buyer.bankBalance - vehicle.price;
        vehicle.owner = buyer;
        System.out.println("Nu äger " + vehicle.owner.name + " fordonet och har " + vehicle.owner.bankBalance + " på kontot");
        System.out.println(this.name + " har nu " + this.bankBalance + " på kontot");
    }
}
