package lesson18;

import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;

public class LambdaTest {
    public static void main(String[] args) {
        double[] exams = {100, 90, 80};
        DoubleStream.of(exams).forEach(new DoubleConsumer() {
            @Override
            public void accept(double value) {
                System.out.println(value * 1.1);
            }
        });
        
        DoubleStream.of(exams).forEach(value -> System.out.println(value * 1.1));
        
    }
}
