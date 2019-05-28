package lesson08_list;

import java.util.LinkedList;
import java.util.Random;

public class LinkedList_Demo2 {
    public static void main(String[] args) {
        
        LinkedList<Integer> s = new LinkedList<>();
        s.add(5);
        s.add(3);
        s.add(4);
        s.add(1);
        System.out.println(s);
        
        for(int count=1;count<s.size();count++) { // 跑的次數
            for (int i = 0; i < s.size() - count; i++) { // 兩兩交換資料
                if (s.get(i) > s.get(i + 1)) {
                    int temp = s.get(i);
                    s.set(i, s.get(i + 1));
                    s.set(i + 1, temp);
                }
            }
            //System.out.println(s);
        }
        System.out.println(s);
        
        
        
        
        
    }
}
