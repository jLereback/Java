package se.iths.beginning;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variabler();
        //tasks();
        //switchar();
        //tasks2();
        //parseDouble();
        //integer();
        //integer2();
        //integer3();

    }

    private static void variabler() {
        Scanner sc = new Scanner(System.in);


        byte number = 123;
        System.out.println(number);
        int integerValue = Integer.MAX_VALUE;
        int secondIntegerValue = 1;

        int sum = integerValue + secondIntegerValue;

        System.out.println(sum);
        float singlePrecision = Integer.MAX_VALUE;

        float f = .1f;
        System.out.println(f);
        System.out.printf("%.10f\n",f); //printf = print formatering (jag kan välja antal decimaltecken)

        float fValue = 16777216.0f;
        System.out.println(fValue);
        System.out.printf("%.1f\n",fValue);
        char ch = 0x41;
        char ch2 = 65;
        char ch3 = 'A';
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(ch3);
        int value;
        value = sc.nextInt();
        int i;

        i =2*value;

        int k = i + 1;

        System.out.println(k);
    }
    private static void tasks () {
        Scanner sc = new Scanner(System.in);

        //Övning 1:
        int x, y;
        x = (int) 120.954;
        y = x * 2;
        System.out.println(x + y);

        String s = "amm";
        s = "fäkt";
        System.out.println("An" + s + "a");

        String a = "an", b = "be", d = "do";
        System.out.println(a + b + a + d + b);

        int x2 = 2, y2 = 4, z = 8;
        System.out.println((x2 * y2 + z) / y2 - z + y2 / (x2 * z / x2));

        //Övning 2:

        System.out.println("Vad heter du?");
        String name = sc.nextLine();
        System.out.println("Hej " + name);
    }
    private static void switchar () {
        Scanner sc = new Scanner(System.in);
        //Old version
        int x = sc.nextInt();
        switch (x)  {
            case 1:
                System.out.println("x is one");
                break;
            case 2:
                System.out.println("x is two");
                break;
            case 3:
                System.out.println("x is tree");
                break;
            default:
                System.out.println("wrong number");
        }
        //new version
        int x2 = sc.nextInt();

        switch (x2) {
            case 1 -> System.out.println("x2 is one");
            case 2 -> System.out.println("x2 is two");
            case 3 -> System.out.println("x2 is tree");
            default -> System.out.println("wrong number");
        }
    }
    private static void tasks2() {
        //Övning1 for-loop:
        for (int i = 10; i <= 100; i += 10) {
            System.out.println(i);
        }

        //Övning2 for-loop:
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(10 - i);
        }

        //Övning3 for-loop:
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
    }
    private static void taskparseDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in ett tal:");
        int x = sc.nextInt();

        System.out.println(x);

        System.out.println("Skriv in ett tal med decimal");
        double d = sc.nextDouble();

        System.out.println(d);

        String s = sc.next();
        System.out.println(s);

        double d2 = Double.parseDouble(s);
        System.out.println(d2);
    }
    private static void integer()    {
        Scanner sc = new Scanner(System.in);
        int x = getInteger(sc);
    }
    private static int getInteger(Scanner sc) {
        int i = 0;
        boolean success = false;
        while (!success) {
            try {
                String s = sc.next();
                i = Integer.parseInt(s);
                success = true;
                System.out.println(i);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        while (!success) ;
        return i;
    }
    private static void integer2()  {
        Scanner sc = new Scanner(System.in);
        int x = getInteger2(sc);
    }
    private static int getInteger2(Scanner sc) {
        int i = 0;
        boolean success = false;
        while (true) {
            try {
                String s = sc.next();
                i = Integer.parseInt(s);
                System.out.println(i);
                break;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return i;
    }
    private static void integer3()  {
        Scanner sc = new Scanner(System.in);
        int x = getInteger3(sc);
    }
    public static int getInteger3(Scanner sc){
        int i = 0;
        while(!sc.hasNextInt()){
            // Invalid char to be parsed as integer, remove from input
            sc.next();
            System.out.println("remove Invalid chars");
        }
        i = sc.nextInt();
        return i;
    }


}