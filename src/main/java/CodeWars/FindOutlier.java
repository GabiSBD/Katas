package CodeWars;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindOutlier {
    static int find(int[] integers) {

        if(Arrays.stream(integers).filter(a -> a % 2 == 0).count() == 1)
           return Arrays.stream(integers).filter(a -> a % 2 == 0).findFirst().getAsInt();
        else if(Arrays.stream(integers).filter(a -> a % 2 != 0).count() == 1)
           return Arrays.stream(integers).filter(a -> a % 2 != 0).findFirst().getAsInt();
        else return -1;
    }
}
