package CodeWars;

public class Solution {
/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 *
 * Note: If the number is a multiple of both 3 and 5, only count it once.*/
    public int solution(int number) {
        int start = 1;
        boolean finish = false;
        int mply3;
        int mply5;
        int result = 0;
        do{
                mply3 = 3 * start < number ? 3 * start : 0;
                mply5 = 5 * start < number ? 5 * start : 0;

                if(mply3 == 0 && mply5 == 0) finish = true;
                else{
                    result += mply5 % 3 == 0 ? mply3 : mply3 + mply5;
                    start++;
                }

        }while(!finish);

        return result;
    }
//    public int solution(int number) {
//        return IntStream.range(0, number)
//                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
//                .sum();
//    }
}
