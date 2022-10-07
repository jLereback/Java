package se.iths.tasks.taskt8;



import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        task8_16();

    }

    private static void task8_2() {
        String task8_2a = getCountries().stream()
                .map(Country::countryName)
                .findFirst()
                .orElse("");
        System.out.println(task8_2a);

        String task8_2b1 = getCountries().stream()
                .skip(getCountries().size() - 1)
                .map(Country::countryName)
                .findFirst()
                .toString();
        System.out.println(task8_2b1);

        String task8_2b2 = getCountries().stream()
                .map(Country::countryName)
                .reduce((first, second) -> second)
                .orElse("");
        System.out.println(task8_2b2);
    }
    private static void task8_3() {
        //Task8_3a
        getCountries().stream()
                .sorted(Comparator.comparing(Country::countryName))
                .map(Country::countryName)
                .forEach(System.out::println);

        //Task8_3b
        getCountries().stream()
                .map(Country::countryName)
                .sorted()
                .forEach(System.out::println);
    }
    private static void task8_4() {
        //Task8_4
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population).reversed())
                .map(Country::countryName)
                .forEach(System.out::println);
    }
    private static void task8_5() {
        String task8_5a = getCountries().stream()
                .max(Comparator.comparing(Country::population))
                .toString();
        System.out.println(task8_5a);

        double task8_5b = getCountries().stream()
                .mapToDouble(Country::population)
                .max()
                .orElse(0.0);
        System.out.println(task8_5b);
    }
    private static void task8_6() {
        double avgArea = getCountries().stream()
                .mapToInt(Country::area)
                .average()
                .orElse(0);
        System.out.printf("%.2f\n", avgArea);

        long task8_6b = getCountries().stream()
                .filter(country -> country.area < avgArea)
                .count();
        System.out.println(task8_6b);
    }
    private static void task8_7() {
        getCountries().stream()
                .filter(country -> (country.population < 5))
                .map(Country::countryName)
                .forEach(System.out::println);
    }
    private static void task8_8() {
        task8_8_populationOver(getCountries(), 10_000);
        task8_8_populationOver(getCountries(), 100_000);
        task8_8_populationOver(getCountries(), 1_000_000);


        int x = 1000_000;
        for (int i = 10_000; i < 1_000_001; i = i * 10) {
            int finalI = i;
            long count = getCountries().stream()
                    .filter(country -> country.area > finalI)
                    .count();
            System.out.println(count);
        }
    }
    public static void task8_8_populationOver(List<Country> countries, int x) {
        long count = countries.stream()
                .filter(country -> country.area > x)
                .count();
        System.out.println(count);
    }
    private static void task8_9() {
        getCountries().stream()
                .filter(country -> country.countryName().charAt(0) == country.capital().charAt(0))
                .forEach(country -> System.out.println(country.countryName() + " " + country.capital()));


/*        //Om man har tom textsträng och det inte ska krascha använder man detta
        // Dock bör det flyttas till en egen metod
        getCountries().stream()
                .filter(country -> !country.countryName().isEmpty() && !country.capital().isEmpty() && country.countryName().charAt(0) == country.capital().charAt(0))
                .forEach(country -> System.out.println(country.countryName() + " " + country.capital()));*/

    }
    private static void task8_10() {
        getCountries().stream()
                .filter(country -> country.countryName().length() > country.capital().length())
                .map(Country::countryName)
                .forEach(System.out::println);

    }
    private static void task8_11() {
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population))
                .limit(5)
                .map(Country::countryName)
                .forEach(System.out::println);
    }
    private static void task8_12() {
        getCountries().stream()
                .filter(country -> country.population > 7)
                .sorted(Comparator.comparing(Country::population))
                .limit(3)
                .map(Country::countryName)
                .forEach(System.out::println);
    }
    private static void task8_13() {
        getCountries().stream()
                .filter(country -> country.area >= 500_000)
                .sorted(Comparator.comparing(Country::countryName).reversed())
                .limit(3)
                .map(Country::countryName)
                .forEach(System.out::println);
    }
    private static void task8_14() {
        getCountries().stream()
                .collect(Collectors.groupingBy(country -> country.countryName.charAt(0)))
                .forEach((character, countryList) -> System.out.println(countryList.size() + ": " + character));

        Map<String, Long> collectByLetter = getCountries().stream()
                .collect(Collectors.groupingBy(country -> country.countryName.substring(0, 1), Collectors.counting()));
        System.out.println(collectByLetter);
    }
    private static void task8_15() {
        var groupedByPopulation = getCountries().stream()
                .sorted(Comparator.comparing(Country::countryName))
                .collect(Collectors.groupingBy(country -> (int) country.population));

        groupedByPopulation.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(Streams::printCountryGroups);
    }
    private static void getListByPopulationSorted(List<Country> countryList, int x) {
        List<Country> countryListSorted = countryList.stream()
                .filter(country -> Math.round(country.population) == x)
                .sorted(Comparator.comparing(country -> country.countryName))
                .toList();

        System.out.println("Länder med " + x + " miljoner invånare:");
        countryListSorted.forEach(country -> System.out.println(country.countryName));
    }
    record Statistics(String countryName, double density) {
        private static Statistics of(Country country) {
            return new Statistics(country.countryName(), country.population() * 1000_000 / country.area());
        }
    }
    private static void task8_16() {
        getCountries().stream()
                .sorted(Comparator.comparing(country -> new StringBuilder(country.capital).reverse()))
                .sorted(Comparator.comparing(Country::capital).reversed())
                .forEach(System.out::println);
    }
    private static String getReverse(Country country) {
        return new StringBuilder(country.capital).reverse().toString();

    }

    private static void task17() {
        getCountries().stream()
                .sorted(Comparator.comparing(Streams::getReverse).reversed())
                .forEach(s -> System.out.println(s.countryName() + " " + getReverse(s)));
    }

    private static void task18() {
        double sixSmallest = getCountries().stream()
                .sorted(Comparator.comparing(Country::area))
                .limit(6)
                .mapToDouble(Country::population)
                .sum();

        double threeLargest = getCountries().stream()
                .sorted(Comparator.comparing(Country::area).reversed())
                .limit(3)
                .mapToDouble(Country::population)
                .sum();

        System.out.println("The sum of the six smallest (by area) countries' populations is: " + sixSmallest);
        System.out.println("The sum of the three greatest (by area) countries' pupulations is: " + threeLargest);
    }



    private static List<Country> getCountries() {
        return List.of(
                new Country("Sverige", "Stockholm", 10.07, 450295),
                new Country("Norge", "Oslo", 5.27, 323802),
                new Country("Island", "Reykjavik", 0.33, 102775),
                new Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Country("Finland", "Helsinki", 5.51, 338424),
                new Country("Belgien", "Bryssel", 11.30, 30528),
                new Country("Tyskland", "Berlin", 82.18, 357168),
                new Country("Frankrike", "Paris", 66.99, 640679),
                new Country("Storbritannien", "London", 60.80, 209331),
                new Country("Niue", "Alofi", 0.0016, 261),
                new Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Country("Polen", "Warszawa", 38.63, 312679),
                new Country("Spanien", "Madrid", 46.5, 505990),
                new Country("Portugal", "Lissabon", 10.31, 92212),
                new Country("Italien", "Rom", 60.59, 301338),
                new Country("Grekland", "Aten", 11.18, 131957),
                new Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Country("Liechtenstein", "Vaduz", 0.038, 160));
    }
    record Country(String countryName, String capital, double population, int area) {

    }

    private static void printCountryGroups(Map.Entry<Integer, List<Country>> entrySet) {
        System.out.println("Länder med " + entrySet.getKey() + " miljoner invånader:");
        entrySet.getValue().forEach(country -> System.out.println(" - " + country.countryName));
    }
}
