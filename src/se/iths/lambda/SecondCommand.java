package se.iths.lambda;

public class SecondCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Second command reporting for duty!");
    }
}
