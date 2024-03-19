package CodeWars;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int result = obj.solution(10);
        System.out.println(result);
    }
    public static List<Object> filterList(final List<Object> list) {

        return list.stream()
                .filter(a -> a.getClass().getName().equals("java.lang.String"))
                .toList();
    }

        public static String encode(String word){
                StringBuilder result = new StringBuilder();
                char[] arr = word.toCharArray();
            for (char c : arr) {
                Pattern pattern = Pattern.compile("(?i)" + "(.*" + c + ".*){2,}");
                Matcher matcher = pattern.matcher(word);
                result.append(matcher.find() ? ")" : "(");
            }

                return result.toString();
        }
//        public static String encode(String word) {
//            Map<Character, Integer> frequency = new HashMap<>();
//            for (char ch : word.toCharArray()) {
//                frequency.merge(Character.toLowerCase(ch), 1, Integer::sum);
//            }
//            StringBuilder result = new StringBuilder(word.length());
//            for (char ch : word.toCharArray()) {
//                result.append(frequency.get(Character.toLowerCase(ch)) > 1 ? ')' : '(');
//            }
//            return result.toString();
//        }
//        public static String encode(String word){
//
//            StringBuilder result = new StringBuilder();
//            char[] arr = word.toCharArray();
//            for (char c : arr) {
//                result.append((word.toUpperCase().chars().filter(ch -> ch == Character.toUpperCase(c)).count() > 1) ? ")" : "(");
//            }
//            return result.toString();
//    }
    }


