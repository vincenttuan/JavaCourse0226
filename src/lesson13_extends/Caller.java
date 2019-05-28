package lesson13_extends;

public class Caller {
    static int s = 100;
    int t = 10;
    
    void print1() {
        System.out.println(s);
        System.out.println(t);
    }
    
    static void print2() {
        System.out.println(s);
        //System.out.println(t);
    }
    
    static void print3() {
        System.out.println(s);
        Caller caller = new Caller();
        System.out.println(caller.t);
    }
}
