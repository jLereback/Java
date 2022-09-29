package se.iths.tasks.tasks7.task7_1;

import java.util.Optional;

public class Safe <T>{
    private  T item;

    public Optional<T> retrieve() {
        if (item == null)
            return Optional.empty();
        else
            return Optional.of(item);
    }

    public void store(T item) {
        this.item = item;
    }

}


