package se.iths.files;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

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

        //Printa text som finns i en fil
        String fileContent = Files.readString(filePath);

        //Printa varje rad i fil som ett element i en lista
        var listOfLines = Files.readAllLines(filePath);

        //Printa alla rader i fil med Streams:
        Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);

        //Printa alla rader i fil förutom de raderna som börjar med #:
        try(Stream<String> lines = Files.lines(filePath)){
            lines.filter(s-> !s.startsWith("#")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        */



        String homeFolder = System.getProperty(("user.home"));
        System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "test.txt");
        System.out.println(filePath);
        System.out.println(Files.exists(filePath));

        readFileAsStream(filePath);
        try {
           Files.writeString(filePath, "\nHello World\nHello World", StandardOpenOption.APPEND);
            String fileContent = Files.readString(filePath);
            System.out.println(fileContent);

        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static void readFileAsStream(Path filePath) {
        try(Stream<String> lines = Files.lines(filePath)){
            lines.filter(s-> !s.startsWith("#")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
