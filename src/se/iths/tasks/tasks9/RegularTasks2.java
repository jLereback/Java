package se.iths.tasks.tasks9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks2 {
    public static final String TEXT = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("as|od", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("[ae][nds]", Pattern.CASE_INSENSITIVE);


        System.out.println(regexHit(pattern2, TEXT));

    }

    private static int regexHit(Pattern pattern, String stringToBeTested) {
        Matcher matcher = pattern.matcher(stringToBeTested);
        return (int) matcher.results().count();
//
//        int count = 0;
//        while (matcher.find()) {
//            count++;
//        }
//        return count;

    }
}
