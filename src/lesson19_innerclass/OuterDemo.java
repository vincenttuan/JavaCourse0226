package lesson19_innerclass;

public class OuterDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.print();
        
        Outer.SInner sin = new Outer.SInner();
        sin.print();
    }
}
