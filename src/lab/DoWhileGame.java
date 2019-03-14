package lab;

import java.util.Random;
import java.util.Scanner;

public class DoWhileGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int ans = new Random().nextInt(99)+1; // 1~99
        do {            
            Scanner scanner = new Scanner(System.in);
            System.out.printf("請輸入 %d ~ %d \n", min, max);
            int guess = scanner.nextInt();
            // 1.先檢查是否在合理範圍 ?
            if (!(guess > min && guess < max)) {
                System.out.println("請輸入合法範圍的資料");
                continue;
            }
            // 2.驗證答案
            if(guess == ans) {
                System.out.println("答對了");
                break; // 強制跳出迴圈
            } else if(guess > ans) {
                max = guess;
            } else {
                min = guess;
            }
            
        } while (true);
        
        
    }
}
