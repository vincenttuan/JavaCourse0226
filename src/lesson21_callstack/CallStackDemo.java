package lesson21_callstack;

public class CallStackDemo {
    public static void main(String[] args) {
        a();
    }
    
    public static void a() {
        b();
    }
    
    public static void b() {
        c();
    }
    
    public static void c() {
        System.out.println(10/0);
    }
}
