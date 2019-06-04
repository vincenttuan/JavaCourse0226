package lesson21_callstack;

public class CallStackDemo {
    public static void main(String[] args) {
        try {
            a();
        } catch (Exception e) {
            System.out.println(e); //e.toString()
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println("------------------------------");
            for(StackTraceElement set : e.getStackTrace()) {
                System.out.println(set);
            }
            System.out.println("------------------------------");
            e.printStackTrace(System.out);
        }
        
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
