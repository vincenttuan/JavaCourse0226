package lesson02;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] x = {100, 90, 80, 70, 60};
        
        // Java 7
        System.out.println(x.length);
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]); // 0~4
        }
        System.out.println("---------");
        // Java 8
        Arrays.stream(x).forEach(System.out::println); // :: -> method reference
        System.out.println("---------");
        
        // java 7 取最大值
        int max = 0;
        for(int i=0;i<x.length;i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        System.out.println(max);
        System.out.println("---------");
        // java 8 取最大值
        System.out.println(Arrays.stream(x).max().getAsInt());
    }
    
}
