package lab;

public class CalcNumber {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE; // int 最大值
        System.out.println(x);
        long y = 2147483648L;
        System.out.println(y);
        // 二進位
        System.out.println(0b01100100);
        // 十六進位
        System.out.println(0xFF);
        System.out.println(0xab);
        // 科學記號
        double value1 = 4200_0000_0000.0;
        System.out.println(value1); // 4.2E11
        double value2 = 4.2e11;
        System.out.println(value2); // 4.2E11
        
        System.out.println('H');
        // unicode page = https://home.gamer.com.tw/creationDetail.php?sn=129149
        System.out.println('\u0048'); // H
        System.out.println('\u2660'); // ♠
        System.out.println('\u2776'); // ❶
        
        // 字元與數字
        int h1 = 'H';
        System.out.println(h1);
        char h2 = 72; 
        System.out.println(h2);
        
        int a = '我';
        int b = '愛';
        int c = '你';
        System.out.println(a+b+c);
        
        boolean love = !!!!!!!!!!!!!!!!!!!!!!!!!true;
        System.out.println(love);
        
    }   
}
