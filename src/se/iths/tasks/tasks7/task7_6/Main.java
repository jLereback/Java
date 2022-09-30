package se.iths.tasks.tasks7.task7_6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("First string");
        myStack.push("Second string");
        myStack.push("Third string");
        System.out.println(myStack.size()); //3
        System.out.println(myStack.pop());  //Third string
        System.out.println(myStack.pop());  //Second string
        System.out.println(myStack.pop());  //First string

//        myStack.print();
//        myStack.printReversed();


        System.out.println(myStack.size()); //0
        System.out.println(myStack.isEmpty()); //true
        // if (!myStack.isEmpty())
        System.out.println(myStack.pop());  //Exception

        List<String> strings = List.of("Hej");

        for( String  s  : strings) {
            System.out.println(s);
        }
    }
}
