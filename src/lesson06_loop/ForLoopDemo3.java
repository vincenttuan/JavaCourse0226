package lesson06_loop;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForLoopDemo3 {
    public static void main(String[] args) {
        int[] score = {100, 90, 80};
        
        int sum = 0;
        for(int x : score) {
            sum += x;
        }
        System.out.println(sum);
        
        // Java 8
        System.out.println(IntStream.of(score).sum());
        
    }
}
