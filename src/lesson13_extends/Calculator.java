package lesson13_extends;

import java.util.stream.DoubleStream;

public class Calculator {
    
    public Number calc(Number x, Number y) {
        return x.doubleValue() + y.doubleValue();
    }
    
    public double calc(double x, double y) {
        return x * y;
    }
    
    public double calc(int x, int y) {
        return y / x;
    }
    
    public double calc(double... x) {
        return DoubleStream.of(x).sum();
    }
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calc(10, 20));
        System.out.println(c.calc(10.0, 20));
        System.out.println(c.calc(10, 20.0));
        
        double[] x = {1, 2, 3.5};
        System.out.println(c.calc(x));
        System.out.println(c.calc(1, 2, 3.5, 4, 5.5, 6, 7, 8, 9, 10));
        System.out.println(c.calc(1));
        System.out.println(c.calc());
        System.out.println(c.calc(3.0, 6.0));
    }
}
