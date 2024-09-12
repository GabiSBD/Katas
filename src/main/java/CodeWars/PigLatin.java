package CodeWars;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PigLatin {
//    public static String pigIt(String str) {
//        return Arrays.stream(str.split(" "))
//                .map(word -> {
//                    Pattern pattern = Pattern.compile("[.,:;!?¿¡'\"(){}\\[\\]_-]");
//                    Matcher matcher = pattern.matcher(word);
//                    if(!matcher.find()){
//                        String c = word.substring(0, 1);
//                        return word.replaceFirst(c,"").concat(c.concat("ay "));
//                    }
//                    return word;
//                }).reduce(String::concat).orElseGet(new Supplier<String>() {
//                    @Override
//                    public String get() {
//                        return "Error during process";
//                    }
//                }).trim();
//    }

    //solution of Blind4Basics (Best one)
//        public static String pigIt(String str) {
//            return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
//        }

    // Revision de mi primera solución
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> {
                    Pattern pattern = Pattern.compile("[.,:;!?¿¡'\"(){}\\[\\]_-]");
                    Matcher matcher = pattern.matcher(word);
                    if(!matcher.find()){
                        String c = word.substring(0, 1);
                        return word.replaceFirst(c,"").concat(c.concat("ay"));
                    }
                    return word;
                }).collect(Collectors.joining(" "));
    }

}
