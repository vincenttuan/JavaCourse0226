package lab;

// 遞增遞減運算子
public class DemoOperation {
    public static void main(String[] args) {
        int age = 10;
        //int var = ++age; // 前序
        int var = age++; // 後序
        System.out.println(age);
        System.out.println(var);
        
        int x = 10;
        int y = x++ + --x - ++x;
        System.out.println(x);
        System.out.println(y);
        
        System.out.println(3.0 == 3);
        
    }
}
