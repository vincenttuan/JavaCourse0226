package lesson19_innerclass;

public class Outer {
    static int sx = 9;
    int x = 7;
    // 一般內部類別
    class Inner {
        void print() {
            System.out.println("Hello Inner");
            System.out.println("sx=" + Outer.sx);
            System.out.println("x=" + Outer.this.x);
            System.out.println("y=" + Outer.SInner.y);
        }
    }
    // 靜態內部類別
    static class SInner {
        static int y = 5;
        static void print() {
            System.out.println("Hello SInner");
            System.out.println("sx=" + Outer.sx);
            //System.out.println("x=" + Outer.this.x);
            System.out.println("y=" + Outer.SInner.y);
        }
    }
    
}
