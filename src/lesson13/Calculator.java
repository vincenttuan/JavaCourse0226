package lesson13;

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
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calc(10, 20));
        System.out.println(c.calc(10.0, 20));
        System.out.println(c.calc(10, 20.0));
    }
}
