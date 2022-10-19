package se.iths.files;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JsonExample {

    public static void main(String[] args) {
        Gson gson = new Gson();

        List<Disc> discList = List.of(new Disc("Pure", 21, 90210), new Disc("Fuse", 21, 90212));
        String json = gson.toJson(discList);

        System.out.println(json);
        //Save json string to file
        String homeFolder = System.getProperty("user.home");

        try {
            Files.writeString(Path.of(homeFolder, "discs.json"), json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Read json string from file
        List<Disc> jsonToObject = gson.fromJson(json, new TypeToken<ArrayList<Disc>>() {}.getType());

        jsonToObject.forEach(System.out::println);
    }
}