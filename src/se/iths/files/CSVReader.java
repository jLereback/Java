package se.iths.files;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CSVReader {
    public static void main(String[] args) {
        String homePath = System.getProperty("user.home");

        Pattern pattern = Pattern.compile(",");

        try (Stream<String> lines = Files.lines(Path.of(homePath,"discs.csv"))) {

            List<Disc> discs = lines.skip(0).map(line -> {
                String[] arr = pattern.split(line);
                return new Disc(
                        arr[0],
                        Integer.parseInt(arr[1]),
                        Integer.parseInt(arr[2]));
            }).toList();

            discs.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
