package se.iths.tasks.tasks7.task7_6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList<Node>();
        Stacken.push(12, list);
        Stacken.push(17, list);

        list.forEach(System.out :: println);
        Stacken.pop(list);
        list.forEach(System.out :: println);

    }
}
