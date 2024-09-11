package CodeWars;

import java.util.Arrays;
import java.util.Comparator;

public class OrderString {
    public static String order(String words) {
        String result = "";
        String[] wordsArr = words.split(" ");

        for (int i =0; i<wordsArr.length; i++){
            for(int j = 0; j < wordsArr.length; j++){
                result = wordsArr[j].contains(String.valueOf(i+1))?
                        result.concat(wordsArr[j]).concat(" ")
                        : result;
            }
        }

        return result.trim();
    }
//    public static String order(String words) {
//        return Arrays.stream(words.split(" "))
//                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//                .reduce((a, b) -> a + " " + b).get();
//    }
}
