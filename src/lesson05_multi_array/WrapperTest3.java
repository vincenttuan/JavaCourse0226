package lesson05_multi_array;

import java.math.BigDecimal;

public class WrapperTest3 {
    public static void main(String[] args) {
        double a = 3.14;
        double b = 4.22;
        System.out.println(a + b);
        System.out.println(a + b == 7.36);
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(a)));
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(b)));
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(a + b)));
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(7.36)));
        
        BigDecimal x = new BigDecimal("3.14");
        BigDecimal y = new BigDecimal("4.22");
        System.out.println(x.add(y));
        
        
    }
}
