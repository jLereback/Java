package se.iths;

public class Tasks_4 {
    public static void main(String[] args) {
        task4_3();
    }

    private static void task4_1() {
        String[] colour = new String[]{"gul", "grön", "orange", "blå", "grå"};
        for (int i = 0; i < colour.length; i++) {
            System.out.println(colour[i]);
        }
    }

    private static void task4_2_1() {
        int[] number = new int[]{2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);
    }

    private static void task4_2_2() {
        int[] number = new int[]{2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0)
                sum = sum + number[i];
        }
        System.out.println(sum);
    }

    private static void task4_2_3() {
        int[] number = new int[]{2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1)
                sum = sum + number[i];        }
        System.out.println(sum);
    }

    private static void task4_3() {
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random()*100);
            System.out.println(num[i]);
        }

        int min = num[0];
        int max = num[0];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 == 1)
                sum++;
        }
        System.out.println("Min är " + min);
        System.out.println("Max är " + max);
        System.out.println(sum + " tal är udda");
    }
}

