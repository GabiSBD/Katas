package CodeWars.fork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class PasswordValidation {

    private static final String TODAY_DATE = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    private static final String[] VALID_MONTHS = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct",
            "nov", "dec" };

    public static boolean validatePassword(String password) {
        if (password.length() < 20 || password.length() > 50 || !isPrime(password.length())
        || !password.contains(String.valueOf(password.length())) || !password.contains(TODAY_DATE)
        || !Arrays.stream(VALID_MONTHS).anyMatch(s -> password.toLowerCase().contains(s)))
            return false;

        else if (!password.matches(("(.*[A-Z].*){3,}"))
                || !password.matches("(.*[a-z].*){1,}")
                || !password.matches("(.*[-._@#$&].*){1,}")
                || password.matches(".*[-._@#$&][-._@#$&].*"))
            return false;

        else if (Arrays.stream(password.split("")).filter(s -> s.matches("[0-9]")).mapToInt(s -> Integer.valueOf(s)).sum() < 25)
            return false;

        else return true;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
