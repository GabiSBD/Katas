package CodeWars;

import java.util.Arrays;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers){
        String result ="";

        for (int i=0; i<numbers.length; i++){
          result = switch (i){
                case 0 -> result.concat("(").concat(String.valueOf(numbers[i]));
                case 2 ->  result.concat(String.valueOf(numbers[i])).concat(") ");
                case 5 ->  result.concat(String.valueOf(numbers[i]).concat("-"));
                default -> result.concat(String.valueOf(numbers[i]));
            };
        }
        return result;
        }
    //    public static String createPhoneNumber(int[] numbers) {
    //        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    //    }
    //public static String createPhoneNumber(int[] numbers) {
    //    String phoneNumber = new String("(xxx) xxx-xxxx");
    //
    //    for (int i : numbers) {
    //        phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
    //    }
    //
    //    return phoneNumber;
    //}
//    public static String createPhoneNumber(int[] numbers) {
//        return Arrays.stream(numbers)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining())
//                .replaceFirst("^(\\d{3})(\\d{3})(\\d{4})$", "($1) $2-$3");
//    }
//    private static String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";
//
//    public static String createPhoneNumber(int[] numbers) {
//        Integer[] numbersInt = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
//        return String.format(PHONE_FORMAT, numbersInt);
//    }
}
