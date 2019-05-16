package lesson15;

import java.util.stream.IntStream;

public interface IScore {
    int[] getScore();
    
    default double getScoreSD() {
        int[] scores = getScore();
        int n = scores.length;
        double avg = IntStream.of(scores).average().getAsDouble();
        int sum = 0;
        for(int i=0;i<n;i++) {
            int x = scores[i];
            sum += Math.pow(x-avg, 2);
        }
        double sd = Math.sqrt(sum/n);
        return sd;
    }
}
