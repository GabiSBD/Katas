package CodeWars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class HighAndLow {
    public static String highAndLow(String numbers) {

        List<Integer> integerList = Arrays.stream(numbers.split(" "))
                .map(Integer::valueOf)
                .toList();
        return integerList.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0).toString()
                .concat(" ")
                .concat(integerList.stream().min(Comparator.comparingInt(Integer::intValue)).orElse(0).toString());
    }
}
