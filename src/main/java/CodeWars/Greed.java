package CodeWars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Greed {
    public static int greedy(int[] dice){

        Map<Integer,Integer> tripletsScoreTable = new HashMap<>();
        tripletsScoreTable.put(1, 1000);
        tripletsScoreTable.put(2, 200);
        tripletsScoreTable.put(3, 300);
        tripletsScoreTable.put(4, 400);
        tripletsScoreTable.put(5, 500);
        tripletsScoreTable.put(6, 600);

        Map<Integer, Integer> simpleScoreTable = new HashMap<>();
        simpleScoreTable.put(1, 100);
        simpleScoreTable.put(5, 50);

        int score = 0;
        int diceValue = 1;
        do{
            Integer matches = count(dice,diceValue).intValue();
            if( matches  >= 3 ){
                Integer extraMatches = matches - 3;
                score = score + (Objects.nonNull(tripletsScoreTable.get(diceValue))? tripletsScoreTable.get(diceValue)
                        : 0 )
                        + (Objects.nonNull(simpleScoreTable.get(diceValue))?
                         simpleScoreTable.get(diceValue) * extraMatches : 0);
            }else {
                score = score + (Objects.nonNull(simpleScoreTable.get(diceValue))?
                            simpleScoreTable.get(diceValue) * matches : 0);
            }

            ++ diceValue;

        }while(diceValue < 7);

        return score;
    }
    public static Long count(int[] dice, int num){
        return  Arrays.stream(dice).filter(n -> n==num).count();
    }
}
