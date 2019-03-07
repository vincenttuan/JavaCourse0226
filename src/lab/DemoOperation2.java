package lab;

public class DemoOperation2 {
    public static void main(String[] args) {
        // 條件運算子 &&, ||
        int x = 1, y = 2;
        boolean c1 = (x > 0) && (y > 0);
        System.out.println(c1);
        
        boolean c2 = (x > 1) && (y > 1);
        System.out.println(c2);
        
        boolean c3 = (x > 1) || (y > 1);
        System.out.println(c3);
        
        int a = 1;
        int b = 1;
        boolean c4 = (a > 1) && (++b > 1); // &, &&
        System.out.println(c4);
        System.out.println("b = " + b);
        
        // 指定運算子
        int value = 1;
        int add = 2;
        value += add; //value = value + add;
        System.out.println("value = " + value);
        
        // 位元運算子
        int e = 5 ^ 3;
        System.out.println(e);
        
        int f = ~13; // 公式 = -(n)-1
        System.out.println(f);
        
                
    }
}
