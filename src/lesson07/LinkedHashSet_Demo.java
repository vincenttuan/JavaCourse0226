package lesson07;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet(); // 有序集合
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        System.out.println(lhs);
        
        HashSet hs = new HashSet(); // 無序集合
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);
    }
}
