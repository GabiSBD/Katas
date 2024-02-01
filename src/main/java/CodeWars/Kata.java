package CodeWars;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    public static void main(String[] args) {
       String[] list = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
       String[] list2 = { "NORTH", "WEST", "SOUTH", "EAST"};
       String[] list3 = {"NORTH", "SOUTH", "EAST", "WEST"};


       String[] result = DirReduction.dirReduc(list3);
        System.out.print(Arrays.toString(result));
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


