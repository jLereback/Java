package se.iths.tasks.tasks6.arvochgranssnitt;

public class FruitBasket {
    public static void main(String[] args) {
        Fruit firstOrange = new Orange(27);
        Citrus secondOrange = new Orange(31);
        Berry firstBlueberry = new Blueberry(3);

        firstOrange.beEaten("mouth");
        secondOrange.beEaten("trash");
        firstBlueberry.beEaten("mouth");

    }
}
