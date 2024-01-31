package CodeWars;

import java.util.Locale;

public class PangramChecker {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    char[]alphabetArray = alphabet.toCharArray();
    public boolean check(String sentence){
        boolean result = true;
        boolean isExist;
        String lowerCaseSentence = sentence.toLowerCase();
        for(char c : alphabetArray) {
            isExist = lowerCaseSentence.contains(String.valueOf(c));
            if(!isExist) result = false;
        }
        return result;

    }
}