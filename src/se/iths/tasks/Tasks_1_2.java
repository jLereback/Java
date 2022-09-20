package se.iths.tasks;

import java.util.Scanner;

public class Tasks_1_2 {

    public static void main(String[] args) {
        //task1_2();
        //task1_3();
        //task1_3_2();
        //task1_4();
        //task1_5();
        //task1_6();
        //task1_7();
        //task2_1();
        //task2_2();
        //task2_3();
        //task2_4();
        //task2_5();
        //task2_6();
        //task2_7();
        //task2_8();
        //task2_8_2();
        //task2_9();
        //task2_9_2();
        //task2_10();
        //task2_11();
        //task2_12();


    }

    private static void task1_2 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
    private static void task1_3 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name and age");

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Hello " + name + ". You are " + age + " years old");
    }
    private static void task1_3_2 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name and age");

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Hello " + name + ". You are " + age + " years old");
    }
    private static void task1_4 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert 2 numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println(sum);
        System.out.println(product);
    }
    private static void task1_5 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert a number with 2 decimals");
        double dec = sc.nextDouble();
        int num = (int) Math.round(dec);
        System.out.println(num);
    }
    private static void task1_6 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert 2 different numbers");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double avg = (num1 + num2) / 2;

        System.out.printf("%.2f\n", avg);
    }
    private static void task1_7 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money is it in your account?");
        double money = sc.nextDouble();
        System.out.println("And the interest?");
        double interest = sc.nextDouble() / 100 + 1;
        double res = money * interest;
        System.out.println("After one year, you'll have " + res + " SEK");

    }
    private static void task2_1 () {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        if( a > 1 )
            System.out.println("a > 1 (första)");
        a--;
        if( a > 1 ) {
            System.out.println("a > 1 (andra)");
        }
        else {
            System.out.println("a <= 1");
        }


    }
    private static void task2_2 () {
        Scanner sc = new Scanner(System.in);
        final char c = 'q';
        switch( c ) {
            case 'a':
                System.out.println("variable is 'a'");
                break;
            case 'b':
                System.out.println("variable is 'b'");
                break;
            default:
                System.out.println("variable is another letter");
                break;
        }


    }
    private static void task2_3 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! Give me the password, please");
        String answer = sc.nextLine();
        String correctAnswer = "Please";

        if (answer.equals(correctAnswer))
            System.out.println("It's correct");
        else
            System.out.println("Bad for you, it's wrong. Try again");
    }
    private static void task2_4 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a random number");
        int num = sc.nextInt();

        if (num > 100) {
            System.out.println("Your number is bigger than 100");
        } else if (num < 100) {
            System.out.println("Your number is smaller than 100");
        } else if (num == 100) {
            System.out.println("Your number is exactly 100");
        }


    }
    private static void task2_5 () {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        month = month.toLowerCase();
        switch (month) {
            case "january" -> System.out.println("1");
            case "february" -> System.out.println("2");
            case "mars" -> System.out.println("3");
            case "april" -> System.out.println("4");
            case "may" -> System.out.println("5");
            case "june" -> System.out.println("6");
            case "july" -> System.out.println("7");
            case "august" -> System.out.println("8");
            case "september" -> System.out.println("9");
            case "october" -> System.out.println("10");
            case "november" -> System.out.println("11");
            case "december" -> System.out.println("12");
            default -> System.out.println("Something went wrong");
        }
    }
    private static void task2_6 () {
        Scanner sc = new Scanner(System.in);
        int level;
        do {
            System.out.println("""
                    Welcome!
                    Choose a level
                    1. Easy     (1-10)
                    2. Medium   (1-100)
                    3. Hard   (1-1000)
                    """);

            level = sc.nextInt();
            if(level == 1)   {
                playGame(10);
            }  else if(level == 2) {
                playGame(100);
            }  else if(level == 3) {
                playGame(1000);
            }  else  {}
        }  while(level != 1 ^ level != 2 ^ level != 3);
    }
    public static int playGame(int maxNumber)  {
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        int guessCounter = 0;

        int answer = (int)(Math.random() * maxNumber) +1;
        System.out.println("Guess on a number between 1 and " + maxNumber);

        while(answer != guess)  {
            guess = sc.nextInt();
            guessCounter ++;
            giveResponse(answer, guess, guessCounter);
        }
        return guessCounter;
    }
    public static void giveResponse(int answer, int guess, int guessCounter) {
        if(answer == guess)  {
            System.out.println("Congrats! You made it in " + guessCounter + " guess(es)!");
        }  else if(answer < guess) {
            System.out.println("Too high! Guess again");
        }  else if(answer > guess) {
            System.out.println("Too low! Guess again");
        }
    }
    private static void task2_7 () {
        for (int i = 1; i <=16 ; i++) {
            System.out.println(i);
        }

    }
    private static void task2_8 () {
        for (int i = 20; i >= 2 ; i = i - 2) {
            System.out.println(i);
            
        }

    }
    private static void task2_8_2 () {
        for (int i = 20; i >= 2 ; i--) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

    }
    private static void task2_9 () {
        Scanner sc = new Scanner(System.in);

        for (int i = 65536; i >= 2; i >>= 1) {
            System.out.println(i);
        }
    }
    private static void task2_9_2 () {
        Scanner sc = new Scanner(System.in);

        for (int i = 65536; i >= 2; i >>= 1) {
            System.out.println(i);
        }
    }
    private static void task2_10 () {
        Scanner sc = new Scanner(System.in);
        String input;

        String finishedWord = "";
        while (true) {
            System.out.println("Give me a word:");
            input = sc.nextLine();
            if (input.isEmpty() || input.equals("."))   {
                finishedWord = finishedWord + input;
                System.out.println(finishedWord);
                break;
            } else {
                finishedWord = finishedWord + " " + input;
                System.out.println(finishedWord);
            }

        }
    }
    private static void task2_11 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        long num = sc.nextLong();

        while (num > 2) {
            if (num % 2 == 1)    {
                num = num * 3 + 1;
            } else  {
                num = num / 2;
            }
            System.out.println(num);
        }

    }
    private static void task2_12 () {
        Scanner sc = new Scanner(System.in);
        for(int y=0; y<5; y++) {
            for(int x=0; x<5; x++) {
                if( x == y )
                    System.out.println("#");
                else
                    System.out.println(".");
            }
            System.out.println("");
        }

    }



}
