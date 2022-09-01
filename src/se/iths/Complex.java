package se.iths;

public class Complex {
    public static void main(String[] args) {

        Box b = new Box();
        b.width = 10;
        System.out.println(b.width);

        Box b2 = new Box();
        b2.width = 40;
        b2.height = 50;
        b2.length = 30;
        System.out.println(b2.length);
    }
}

class Box {
    int length;
    int width;
    int height;
}
