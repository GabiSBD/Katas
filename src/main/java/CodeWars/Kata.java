package CodeWars;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        System.out.println(dictionary.findMostSimilar("berry"));
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

        public static String createPhoneNumber(int[] numbers){
        //fuckin clever way from codewars
            return Arrays.stream(numbers)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining())
                    .replaceFirst("^(\\d{3})(\\d{3})(\\d{4})$", "($1) $2-$3");


            //way be me 2
//        String result = "(XXX) XXX-XXXX";
//
//        for(int n : numbers) result = result.replaceFirst("X", String.valueOf(n));
//
//        return result;
        //way by me
//            String result = "(XXX) XXX-XXXX";
//            StringBuilder resultBuilder = new StringBuilder(result);
//
//            AtomicInteger index = new AtomicInteger(0);
//
//            Arrays.stream(numbers).forEach(number -> {
//                int pos = resultBuilder.indexOf("X", index.get());
//                if (pos != -1) {
//                    resultBuilder.replace(pos, pos + 1, String.valueOf(number));
//                    index.set(pos + 1);
//                }
//            });
//
//            result = resultBuilder.toString();
//            return result;
        }

    }


