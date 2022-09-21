package se.iths.lambda;

public class FirstCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Norway!!");
    }

}
