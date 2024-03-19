package CodeWars;

import java.util.*;
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)

        StringBuilder result = new StringBuilder();
        String[] words;

        words = morseCode.split("\s{3}");

        for (String word : words) {

            String[] letters = word.split("\s");

       //     for (String letter : letters) if(Objects.nonNull(MorseCode.get(letter)) && !letter.equals(" ")) result.append(MorseCode.get(letter));

            if(!result.isEmpty()) result.append(" ");
        }

        return result.substring(0, result.toString().length() - 1);

    }
}