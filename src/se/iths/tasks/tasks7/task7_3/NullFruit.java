package se.iths.tasks.tasks7.task7_3;


import se.iths.tasks.tasks6.arvochgranssnitt.Fruit;

public class NullFruit extends Fruit {

    private static final Fruit nullFruit = new NullFruit();

    public NullFruit() {
        super(0);
    }

    @Override
    public Fruit getWeight() {
        return null;
    }

    public static Fruit of() {
        return nullFruit;
    }
}

