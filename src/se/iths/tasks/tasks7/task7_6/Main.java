package se.iths.tasks.tasks7.task7_6;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> list = new Stack<>();
        System.out.println(list.size());
        list.push(12);
        System.out.println(list.size());
        list.push(17);

        System.out.println(list.size());
        System.out.println(list.pop());
        System.out.println(list.size());
        System.out.println(list.pop());
        System.out.println(list.size());

    }
}
