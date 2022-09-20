package se.iths.tasks;

public class Tasks_5 {

    public static void main(String[] args) {
        task7();
        //System.out.println(task6(Month.JANUARY));

    }

    private static void task2() {
        System.out.println(task2Add(2.5, 9.4));
        System.out.println(task2Multi(2, 9, 4));
    }
    private static double task2Add(double x, double y) {
        return x + y;
    }
    private static int task2Multi(int x, int y, int z) {
        return x * y * z;
    }
    public static int task6(Month month) {
        return month.numOfDays;

    }
    public enum Month {
        JANUARY(31),
        FEBRUARY(28),
        MARS(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);
        final int numOfDays;

        Month(int numOfDays) {
            this.numOfDays = numOfDays;
        }
    }

    private static void task7() {
        
        String abcde = "abcde";
        System.out.println(abcde.substring(2, 1));
    }






}
