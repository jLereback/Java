package se.iths.tasks.tasks7.task7_1;

import se.iths.tasks.Tasks_1_2;

public class Main {

    public static void main(String[] args) {
        Safe<String> safe = new Safe();
        System.out.println(safe.retrieve());
        safe.store("pistol");
        System.out.println(safe.retrieve());
    }
}