package se.iths.lambda;

public class SwedishCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Hej från Sverige!");
    }
}
