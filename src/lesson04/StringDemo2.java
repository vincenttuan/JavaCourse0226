package lesson04;

import java.util.Base64;

public class StringDemo2 {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D'};
        String str = "甲乙丙丁";
        
        System.out.println(chars);
        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        str.getChars(1, 3, chars, 1);
        
        System.out.println(chars);
        
    }
}
