package se.iths.tasks.tasks7.task7_6;

import java.util.LinkedList;

public class Stacken<T> {

    public static void push(Object value, LinkedList list) {
        list.addLast(value);
    }

    public static void pop(LinkedList list) {
        list.removeFirst();
    }
}
