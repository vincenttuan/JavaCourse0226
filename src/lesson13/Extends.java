package lesson13;

class A {

    public A(int x) {
        System.out.println("A");
    }
    
}

class B extends A{

    public B() {
        super(0);
        System.out.println("B");
    }
    
}

public class Extends {
    public static void main(String[] args) {
        new B();
    }
}
