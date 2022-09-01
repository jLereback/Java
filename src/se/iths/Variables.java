package se.iths;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

/*        byte number = 123;
        System.out.println(number);
*/
/*
        int integerValue = Integer.MAX_VALUE;
        int secondIntegerValue = 1;

        int sum = integerValue + secondIntegerValue;

        System.out.println(sum);
*/
/*
        float singlePrecision = Integer.MAX_VALUE;

        float f = .1f;
        System.out.println(f);
        System.out.printf("%.10f\n", f); //printf = print formatering (jag kan välja antal decimaltecken)

        float fValue = 16777216.0f;
        System.out.println(fValue);
        System.out.printf("%.1f\n", fValue);
*/
/*        char ch = 0x41;
        char ch2 = 65;
        char ch3 = 'A';
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(ch3);
*/
/*
        int value;
        value = scanner.nextInt();
*/
/*
        int i;

        i = 2 * value;

        int k = i + 1;

        System.out.println(k);
*/
/*
        //Övning 1:
        int x, y;
        x = (int)120.954;
        y = x * 2;
        System.out.println(x + y);

        String s = "amm";
        s = "fäkt";
        System.out.println("An" + s + "a");

        String a = "an", b = "be", d= "do";
        System.out.println(a + b + a + d + b);

        int x2 = 2, y2 = 4, z = 8;
        System.out.println( (x2 * y2 + z) / y2 - z + y2 / (x2 * z / x2) );

        //Övning 2:

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();
        System.out.println("Hej " + name);
*/
/*        //Old version
        int x = scanner.nextInt();
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
        }*/
/*        //new version
        int x = scanner.nextInt();

        switch (x) {
            case 1 -> System.out.println("x is one");
            case 2 -> System.out.println("x is two");
            case 3 -> System.out.println("x is tree");
            default -> System.out.println("wrong number");
        }*/
/*        //Övning1 for-loop:
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
        }*/
/*        //Endast tillgänglig för for-loopen
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }

        //Tillgänglig för resten av koden
        int i = 10;
        for (; i >= 0 ; i--) {
            System.out.println(i);
        }
        */
/*
        int i = 10;
        for (;  ; ) {
            if(i < 0 )
                break;
            System.out.println(i);
            i--;
        }
*/
/*        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }*/
/*
        System.out.println("Skriv in ett tal:");
        int x = scanner.nextInt();

        System.out.println(x);

        System.out.println("Skriv in ett tal med decimal");
        double d = scanner.nextDouble();

        System.out.println(d);

        String s = scanner.next();
        System.out.println(s);

        double d2 = Double.parseDouble(s);
        System.out.println(d2);
*/
/*
        int x = getInteger(scanner);
    }
        private static int getInteger(Scanner scanner) {
            int i = 0;
            boolean success = false;
            do (!success) {
                try {
                    String s = scanner.next();
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
*/
/*
        int x = getInteger2(scanner);
        }
        private static int getInteger2(Scanner scanner) {
            int i = 0;
            boolean success = false;
            while(true)  {
                try {
                    String s = scanner.next();
                    i = Integer.parseInt(s);
                    System.out.println(i);
                    break;
                } catch (Exception e)   {
                    System.out.println("Error");
                }
            }
            return i;
*/
/*
        int x = getInteger3(scanner);
        }
        public static int getInteger3(Scanner scanner){
            int i = 0;
            while(!scanner.hasNextInt()){
                // Invalid char to be parsed as integer, remove from input
                scanner.next();
                System.out.println("remove Invalid chars");
            }
            i = scanner.nextInt();
            return i;
        }
*/

    }
}