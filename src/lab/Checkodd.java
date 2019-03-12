package lab;

import java.util.Random;

public class Checkodd {
    public static void main(String[] args) {
        
        int x = new Random().nextInt(100); // 0~99
        System.out.println(x);
        if(x % 2 == 0) 
            System.out.println("偶數");
        else
            System.out.println("奇數");
        //----------------------------------------
        // 三元運算子
        System.out.println((x % 2 == 0)?"偶數":"奇數");
        
    }
}
