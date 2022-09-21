package se.iths.beginning;

import se.iths.beginning.Box;

public class BoxDemo {
    public static void main(String[] args) {

        Box smallBox = new Box();
        smallBox.height = 10;
        smallBox.width = 5;
        smallBox.length = 10;

        System.out.println(smallBox.height);

        increaseBoxSize(smallBox);
        smallBox.increaseBoxSize();

        System.out.println(smallBox.height);
    }

    public static void increaseBoxSize(Box box) {
        box.height = box.height * 2;
        box.width = box.width * 2;
        box.length = box.length * 2;


    }
}
