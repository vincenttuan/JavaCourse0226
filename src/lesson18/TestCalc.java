package lesson18;

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
        // Java 8
        
    }
    
    public static void show(Calc calc) {
        System.out.println(calc.call(10));
    }
    
}
