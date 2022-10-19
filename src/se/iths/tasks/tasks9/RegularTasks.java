package se.iths.tasks.tasks9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks {
    public static void main(String[] args) {
        String text = "min katt har tre konkatenerade kanter";
        Pattern pattern = Pattern.compile("kat", Pattern.CASE_INSENSITIVE);


//Task1        System.out.println("kat exists in string: " + regexHit(pattern, text));
//Task2        regexTester("k(at|an|on)", text);
//Task3        regexTester("a[a-zåäö]", text);
//Task4        regexTester("[^t]t[^t]", text);
       tTester(text);
    }

    private static void tTester(String text) {
        for (int i = 0; i < text.length(); i++) {

        }
        //text.charAt()
        //if
    }
    private static void regexTester(String regex, String stringToBeTested) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringToBeTested);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        System.out.println("Hits" + count);
    }
    private static boolean regexHit(Pattern pattern, String stringToBeTested) {
        Matcher matcher = pattern.matcher(stringToBeTested);
        return matcher.find();
    }
}
