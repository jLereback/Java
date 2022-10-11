package se.iths.files;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileExample {
    public static void main(String[] args) {
/*        //Hämtar sökväg från användaren
        System.out.println(System.getProperty("user.home"));

        //Hämtar operativsystemet
        System.out.println(System.getProperty("os.name"));


        //Kollar om sökvägen faktiskt existerar:
        Files.exists(homePath);

        //Skapa fil:
        Files.createFile(filePath);

        //Flytta/ändra namn på fil:
        Files.move(filePath, Path.of(homeFolder, "moved.txt"));

        //Radera fil:
        Files.delete((filePath));

        //Skapa fil och lägg in text alternativt skriv över befintlig fil och lägg in text:
        Files.writeString(filePath, "Hello World");

        //Lägg till text i befintlig fil
        Files.writeString(filePath, "Hello World\n", StandardOpenOption.APPEND);

        //Throw exception om en fil redan existerar för att inte råka skriva över befintlig data
        Files.writeString(filePath, "Hello World\n", StandardOpenOption.CREATE_NEW);



        */



        String homeFolder = System.getProperty(("user.home"));
        System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "test.txt");
        System.out.println(filePath);
        System.out.println(Files.exists(filePath));

        try {
            Files.writeString(filePath, "Hello World\n");

        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }

    }
}
