package lab;

import java.util.Random;

public class WhileDemo2 {
    public static void main(String[] args) {
        int a1=0, a2=0,a3=0,a4=0,a5=0,a6=0; // 各點出現次數
        double amount = 0; // 總次數
        while(true) {
            ++amount;
            int a = new Random().nextInt(6) + 1; // 實際骰出的點數
            switch(a) {
                case 1:
                    a1++;
                    break;
                case 2:
                    a2++;
                    break;    
                case 3:
                    a3++;
                    break;    
                case 4:
                    a4++;
                    break;    
                case 5:
                    a5++;
                    break;  
                case 6:
                    a6++;
                    break;    
            }
            // 統計
            System.out.printf("第 %d 次骰出了 %d, 統計結果 1=%.2f, 2=%.2f, 3=%.2f, 4=%.2f, 5=%.2f, 6=%.2f\n", (int)amount, a, a1/amount, a2/amount, a3/amount, a4/amount, a5/amount, a6/amount);
            // delay
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
        
    }
}
