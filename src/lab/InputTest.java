package lab;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // 監聽鍵盤資訊
        System.out.println("請輸入數字");
        int x = scanner.nextInt(); // 得到使用者輸入的數字
        System.out.println("請再一次輸入數字");
        int y = scanner.nextInt(); // 得到使用者輸入的數字
        System.out.println("數字總和 = " + (x+y));
        
    }
}
