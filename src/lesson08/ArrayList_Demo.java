package lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayList_Demo {
    public static void main(String[] args) {
        
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(8,5,3,7,6,1,9,4,6,7));
        System.out.println(scores);
        Collections.sort(scores);
        System.out.println(scores);
        scores.remove(0);
        scores.remove(0);
        scores.remove(scores.size()-1);
        scores.remove(scores.size()-1);
        System.out.println(scores);
        
        // Java 7
        int sum = 0;
        for(int s : scores) {
            sum += s;
        }
        System.out.println("sum = " + sum);
        //System.out.println("avg = " + sum/(scores.size()*1.0));
        
        // Java 8
        int sum2 = scores.stream().reduce(0, (a, b) -> {
            System.out.printf("a=%d, b=%d, a+b=%d\n", a, b, (a+b));
            return a+b;
        });
        System.out.println(sum2);
        
        int sum3 = scores.stream().reduce(0, (a, b) -> a+b);
        System.out.println(sum3);
        
        int sum4 = scores.stream().reduce(0, (a, b) -> Integer.sum(a, b));
        System.out.println(sum4);
        
        int sum5 = scores.stream().reduce(0, Integer::sum);
        System.out.println(sum5);
        
        //System.out.println(IntStream.of(1, 2, 3).sum());
        int sum6 = scores.stream().mapToInt(Integer::intValue).sum(); // Integer 的 Stream 轉成 int 的 Stream 也就是 IntStream
        System.out.println(sum6);
    }
    
    public static int mySum(int a, int b) {
        return a + b;
    }
}
