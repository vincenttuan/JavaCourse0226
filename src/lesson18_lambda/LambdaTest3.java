package lesson18_lambda;

import java.util.function.IntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class LambdaTest3 {
    
    public static void main(String[] args) {
        double[] exams = {100, 90, 80, 70, 60, 50, 40};
        
        DoubleStream.of(exams)
                .filter(x -> x >= 60)
                .mapToInt(x -> (int)(x * 1.1))
                .forEach(System.out::println);
        System.out.println("---------");        
        DoubleStream.of(exams)
                .mapToInt(x -> (int)(x >= 60 ? x*1.1 : x*0.9))
                .forEach(System.out::println);
    }
}
