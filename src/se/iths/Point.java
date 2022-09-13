package se.iths;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double distanceTo(Point other) {
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
      }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}