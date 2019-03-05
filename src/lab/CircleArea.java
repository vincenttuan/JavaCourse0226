package lab;

public class CircleArea {
    public static void main(String[] args) {
        int    r = 8;
        double pi = Math.PI;
        String txt = "圓面積";
        
        double area = Math.pow(r, 2) * pi;
        
        System.out.printf("半徑 = %d %s = %.2f\n", r, txt, area);
        
        System.out.println("半徑 = " + r + " " + txt + " = " + area);
                
    }
}
