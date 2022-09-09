package se.iths;

public class Box {
    int height;
    int width;
    int length;

    public void increaseBoxSize() {
        height = height * 2;
        width = width * 2;
        length = length * 2;
    }
}
