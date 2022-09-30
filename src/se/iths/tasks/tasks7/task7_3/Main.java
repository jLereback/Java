package se.iths.tasks.tasks7.task7_3;

import se.iths.tasks.tasks6.arvochgranssnitt.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Fruit> fruitBasket = new HashMap<>();


        fruitBasket.put("Orange", new Orange(3));
        fruitBasket.put("Blueberry", new Blueberry(4));

        fruitBasket.get("Orange").getWeight();
        System.out.println("Size = " + fruitBasket.size());

        fruitBasket.remove("Orange");
        if (fruitBasket.containsKey("Orange"))
            fruitBasket.get("Orange").getWeight();

        fruitBasket.getOrDefault("Orange", NullFruit.of().getWeight());

        System.out.println("Size = " + fruitBasket.size());
    }
}
