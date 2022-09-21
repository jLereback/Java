package se.iths.tasks.tasks6.arvochgranssnitt;

public abstract class FruitBasket {
    public static void main(String[] args) {
        Fruit apelsin = new Orange(27);
        Berry blåbär = new Blueberry(3);

        apelsin.beEaten("munnen");
        blåbär.beEaten("munnen");


    }
}
