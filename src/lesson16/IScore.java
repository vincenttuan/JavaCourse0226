package lesson16;

import java.util.stream.IntStream;

public interface IScore {
    int[] getScore();
    
    default int getSum() {
        int[] scores = getScore();
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return sum;
    }
    
    default int getSum2() {
        int[] scores = getScore();
        int sum = IntStream.of(scores).sum();
        return sum;
    }
    
    default int getSum3() {
        int[] scores = getScore();
        int sum = IntStream.of(scores)
                .reduce(0, (total, score) -> total + score);
        return sum;
    }
    
    default double getSD() {
        int[] scores = getScore();
        int n = scores.length;
        double avg = getSum()/n;
        double sum = 0;
        for(int i=0;i<n;i++) {
            sum += Math.pow(scores[i]-avg, 2);
        }
        double sd = Math.sqrt(sum/n);
        return sd;
    }
    
    default double getSD2() {
        int[] scores = getScore();
        int n = scores.length;
        double avg = getSum()/n;
        double sum = IntStream.of(scores)
                .mapToDouble(score -> score * 1.0)
                .reduce(0, (total, score) -> total + Math.pow(score-avg, 2));
        double sd = Math.sqrt(sum/n);
        return sd; 
    }
    
    default void copyRight() {
        System.out.println("巨匠電腦....");
    }
}
