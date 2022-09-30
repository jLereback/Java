package se.iths.tasks.tasks7.task7_6;

import java.util.LinkedList;

public class Stack<E> {
    private final LinkedList<E> list = new LinkedList<>();

    private int length;
    public void push(E value) {
        int i = 0;
        list.addLast(value);
        length++;
    }
    public E pop() {
        length--;
        return list.removeLast();
    }

    public int size() {
        return length;
    }
}
