package lesson07;

import java.util.HashSet;

public class HasSet_Demo {
    public static void main(String[] args) {
        
        HashSet set = new HashSet(); // 無順序的陣列
        set.add("Mary"); // String
        set.add(Double.valueOf("3.14")); // Double
        set.add(2.76); // Double
        set.add("中文"); // String
        set.add(100); // Integer
        set.add(100); // Integer
        
        System.out.println(set);
        
    }
}
