package lesson07;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSet_Demo {
    public static void main(String[] args) {
        // 電腦選號今彩539 (1~39 任意選 5組)
        HashSet<Integer> set = new HashSet<>(); // 無順序的陣列
        while(set.size() < 5) {
            set.add(new Random().nextInt(39) + 1);
        }
        
        TreeSet<Integer> tree = new TreeSet(set);
        
        System.out.println("本期開獎開出順序:" + set);
        System.out.println("本期開獎開出順序:" + tree);
    }
}
