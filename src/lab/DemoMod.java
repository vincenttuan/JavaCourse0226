package lab;

public class DemoMod {
    public static void main(String[] args) {
        
        double x = Math.random(); // 取出亂數 0~1
        System.out.println(x);
        System.out.println(x * 10000); // 乘 10000 
        int y = (int)(x * 10000); // 轉換成 int
        System.out.println(y);
        System.out.println(y % 10); // mod 10 取出 0~9
    }
}
