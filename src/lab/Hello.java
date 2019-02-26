package lab;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(1+1);
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(10*10*3.14);
        System.out.println(10*10);
        System.out.println(10*10*10);
        System.out.println(60.5/((171.3/100)*(171.3/100)));
        
        // 變數
        double w = 60.5;      // 體重
        double h = 171.3/100; // 身高先除以 100
        double bmi = w / (h*h);
        System.out.println(bmi);
        
    }
}
