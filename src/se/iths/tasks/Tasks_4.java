package se.iths.tasks;

import java.util.Scanner;

public class Tasks_4 {
    public static void main(String[] args) {
        task4_7_j();
        //task4_4();
    }

    private static void task4_1() {
        String[] colour = {"gul", "grön", "orange", "blå", "grå"};
        for (String s : colour) {
            System.out.println(s);
        }
    }

    private static void task4_2_1() {
        int[] number = new int[]{2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int j : number) {
            sum = sum + j;
        }
        System.out.println(sum);
    }

    private static void task4_2_2() {
        int[] number = new int[]{2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int j : number) {
            if (j % 2 == 0)
                sum = sum + j;
        }
        System.out.println(sum);
    }

    private static void task4_2_3() {
        int[] number = new int[]{2, 3, 5, 8, 13, 21, 34};
        int sum = 0;
        for (int j : number) {
            if (j % 2 == 1)
                sum = sum + j;
        }
        System.out.println(sum);
    }

    private static void task4_3() {
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.println(num[i]);
        }

        int min = num[0];
        int max = num[0];
        int sum = 0;

        for (int k : num) {
            if (k < min)
                min = k;
        }
        for (int j : num) {
            if (j > max)
                max = j;
        }
        for (int j : num) {
            if (j % 2 == 1)
                sum++;
        }
        System.out.println("Min är " + min);
        System.out.println("Max är " + max);
        System.out.println(sum + " tal är udda");
    }

    private static void task4_4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in hur många tal arrayen ska bestå av");
        int[] num = new int[sc.nextInt()];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.println(num[i]);
        }

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.printf("Medelvärdet är %.2f", (double) sum / num.length);


    }

    private static void task4_7_a() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 4; column++) {
                if (row == column)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_b() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 8; column++) {
                if (column == row || column == row + 4)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_c() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 4; column++) {
                if (row == column)
                    System.out.print("##");
                else
                    System.out.print("--");
            }
        }
    }

    private static void task4_7_d() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 8; column++) {
                if (column == 2 || column == 5 || row == 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_e() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 8; column++) {
                if (row == column || (row == 1 && column == 3) || (row == 3 && column == 1) || (row == 0 && column == 4))
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_f() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 4; column++) {
                if (column == row + 2 || column == row || column == row - 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_g() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 6; column++) {
                if (row < 3 && column < 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_h() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 8; column++) {
                if (column == row + 3 || row < 2 && column > 5)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_i() {
        for (int row = 0; row < 4; row++) {
            System.out.println();
            for (int column = 0; column < 5; column++) {
                if (column == 2 && row != 1)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
    }

    private static void task4_7_j() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                
                Give me an uneven number 
                """);
        int rowSize = sc.nextInt();
        if (rowSize % 2 == 0) {
            System.out.println("""            
            You need to choose an uneven number
            """);
            task4_7_j();
        }
        for (int row = 0; row < rowSize; row++) {
            System.out.println();
            for (int column = 0; column < rowSize; column++) {
                if (column == row && column == rowSize - 1 - row)
                    System.out.print("o");
                else if (column == row || column == rowSize - 1 - row)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
        }
        task4_7_j();
    }

}