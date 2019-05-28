package lesson18_lambda;

import java.util.stream.DoubleStream;

public class LambdaTest2 {
    public static void main(String[] args) {
        double[] exams = {100, 90, 80, 70, 60, 50, 40};
        DoubleStream.of(exams).forEach(x -> System.out.println(x));
        DoubleStream.of(exams).forEach(System.out::println);
        
    }
}
