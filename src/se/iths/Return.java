package se.iths;

import java.util.Arrays;

class Return {
    public static int[] getDetails() {
        int v1 = 30;
        int v2 = 50;
        int v3 = 100;

        return new int[]{v1, v2, v3};
    }

    // Return multiple values from a method in Java
    public static void main(String[] args) {
        int[] ints = getDetails();
        System.out.println(Arrays.toString(ints));
    }
}