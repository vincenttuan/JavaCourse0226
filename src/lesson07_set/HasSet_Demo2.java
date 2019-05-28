package lesson07_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class HasSet_Demo2 {
    
    // 本期開獎
    private static HashSet<Integer> ans = new HashSet<>(Arrays.asList(3,34,24,17,32));
    
    public static void main(String[] args) {
        int cost = 0;
        int win = 0;
        OUTER:
        while (true) {
            cost += 50;
            int bet = lotto();
            System.out.println("我中幾注:" + bet);
            switch (bet) {
                case 2:
                    win += 50;
                    break;
                case 3:
                    win += 300;
                    break;
                case 4:
                    win += 2_0000;
                    break;
                case 5:
                    win += 800_0000;
                    break OUTER;
                default:
                    break;
            }
        }
        System.out.printf("張數:%,d  獎金 $%,d  成本 $%,d  賺賠 $%,d\n", cost/50, win, cost, (win-cost));
    }
    
    public static int lotto() {
        // 電腦選號今彩539 (1~39 任意選 5組)
        HashSet<Integer> set = new HashSet<>(); // 無順序的陣列
        while(set.size() < 5) {
            set.add(new Random().nextInt(39) + 1);
        }
        System.out.println("這我買的:" + set);
        System.out.println("本期開獎:" + ans);
        
        int bet = 0;
        for(Integer i : set) {
            for(Integer a : ans) {
                if(i==a){
                    bet++;
                    System.out.println(i);
                    break;
                }
            }
        }
        
        return bet;
    }
    
}
