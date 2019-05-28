package lesson05_multi_array;

public class WrapperTest {
    public static void main(String[] args) {
        int x = 100;
        Integer y = Integer.valueOf("200");
        Integer z = 300; // auto-boxing Integer.valueOf("300");
        System.out.println(x + y.intValue());
        System.out.println(x + y); // auto-unboxing
        
        x = x * 2;
        System.out.println(x);
        
        y = y * 2;
        System.out.println(y);
    }
}
