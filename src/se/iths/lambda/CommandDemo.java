package se.iths.lambda;

public class CommandDemo {

    public static void main(String[] args) {

        Command firstCommand = new SwedishCommand();
        Command secondCommand = new NorweiganCommand();
        //Anonym klass:
        Command thirdCommand = new Command() {
            @Override
            public void execute() {
                System.out.println("Hello from England!");
            }
        };
        //Lambda-uttryck:
        Command fourthCommand = () -> System.out.println("Halo à Alba");

        handleCommand(firstCommand);
        handleCommand(secondCommand);
        handleCommand(thirdCommand);
        handleCommand(fourthCommand);

        MathCalculation mathCalculation = (number1, number2) -> number1 + number2;

        calculateAndPrint(mathCalculation);

        calculateAndPrint((number1, number2) -> number1 * number2);

        calculateAndPrint(CommandDemo::divide);
    }

    public static int divide(int a, int b) {
        return a/b;
    }
    public static void handleCommand(Command theCommand) {
       // System.out.println("This is handleCommand ready to execute the command.");
        theCommand.execute();
    }

    public static void calculateAndPrint(MathCalculation mathCalculation) {
        System.out.println(mathCalculation.calculate(2,3));
    }
}

