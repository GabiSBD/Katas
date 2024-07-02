package CodeWars;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public boolean checkWithRegex(String sentence){
        Pattern pattern = Pattern.compile("(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)(?=.*w)(?=.*x)(?=.*y)(?=.*z)");
        Matcher matcher = pattern.matcher(sentence.toLowerCase().replaceAll("[^a-z]", ""));

        return matcher.find();
    }

    //from codewars
    public  boolean checkWithStream(String sentence){
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}