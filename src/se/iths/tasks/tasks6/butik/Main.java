package se.iths.tasks.tasks6.butik;

public class Main {
    public static void main(String[] args) {
        Seller firstSeller = new Seller("Halvor", 29, 1000000);
        Seller firstBuyer = new Seller("Harald", 58, 500000);
        Buyer secondBuyer = new Buyer("Ena", 19, 7000000);
        Retailer hedinBil = new Retailer("David", 25, 400000);


        OnLand cKlass = new Car(1800, 300000, firstSeller, 11);
        InAir jas39Gripen = new Airplane(1080, 3000000, hedinBil);
        Vehicle firstHelicopter = new Helicopter(1080, 300000, firstSeller);



        //print(cKlass);
        //print(firstMc);
        //cKlass.drive(12);
        //jas39Gripen.fly(true);
        //cKlass.printOwner();
        //hedinBil.buyVehicle(cKlass);
        //hedinBil.sellVehicle(jas39Gripen, secondBuyer);
    }

    public static void print(Vehicle v) {
        System.out.println(v);

    }


}
