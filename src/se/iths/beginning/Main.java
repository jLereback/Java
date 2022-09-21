package se.iths.beginning;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point(1,1);
        Point point3 = new Point(point2);

        double distance = point1.distanceTo(point2);

        System.out.println(distance);
    }




}