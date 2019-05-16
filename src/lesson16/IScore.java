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
        int sum = IntStream.of(scores).reduce(0, (total, score) -> total + score);
        return sum;
    }
    
    default void copyRight() {
        System.out.println("巨匠電腦....");
    }
}
