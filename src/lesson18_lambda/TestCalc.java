package lesson18_lambda;

public class TestCalc {
    public static void main(String[] args) {
        // Java 7
        Calc c = new Calc(){
            public int call(int x) {
                return x + x;
            }
        };
        System.out.println(c.call(10));
        show(c);
        show(new Calc(){
            public int call(int x) {
                return x * x;
            }
        });
        System.out.println("----------");
        // Java 8
        Calc c2 = (int x) -> {return x + x;};
        Calc c3 = (int x) -> x * x;
        Calc c4 = x -> x * x + x;
        show(c4);
        show(x -> x * x - x);
    }
    
    public static void show(Calc calc) {
        System.out.println(calc.call(10));
    }
    
}
