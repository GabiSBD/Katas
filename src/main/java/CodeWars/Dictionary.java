package CodeWars;


import org.apache.commons.text.similarity.LevenshteinDistance;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        String result = "";
        int score = Integer.MAX_VALUE;

        for (String word : words){
            int counter = new LevenshteinDistance().apply(to,word);
            if (counter<score) {
                result =word;
                score = counter;
            }
        }
        return result;
    }
}
