package se.iths.tasks.tasks6.butik;

public abstract class Person {
    public String name;
    public int age;
    public int bankBalance;

    public Person(String name, int age, int bankBalance) {
        this.name = name;
        this.age = age;
        this.bankBalance = bankBalance;
    }





    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bankBalance=" + bankBalance +
                '}';
    }

    public void buyVehicle(Vehicle vehicle) {}
    public void sellVehicle(Vehicle vehicle, Buyer buyer) {}

}