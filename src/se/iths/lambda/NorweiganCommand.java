package se.iths.lambda;

public class NorweiganCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Hei fra Norge!");
    }

}
