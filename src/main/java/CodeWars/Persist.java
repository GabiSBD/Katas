package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Persist {
    public static int persistence(long n) {

        if(n < 10L) return 0;

        char[] arr = Long.toUnsignedString(n).toCharArray();
        int result = 0;
        long acumulator = 1;

        for(char c : arr) acumulator *= Long.parseLong(String.valueOf(c));

        if(acumulator>=10L) result = persistence(acumulator);

        result += 1;

        return result;
    }

}
