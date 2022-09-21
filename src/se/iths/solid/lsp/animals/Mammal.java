package se.iths.solid.lsp.animals;

public abstract class Mammal {

    public String name = "";

    public String getName(){
        return name;
    }

    abstract void talk();
}