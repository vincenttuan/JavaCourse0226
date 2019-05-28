package lesson03_array;

import java.util.Scanner;
import static lesson03_array.PokerDemo.getBaccaratScore;
import static lesson03_array.PokerDemo.shuffle;
import static java.lang.System.out;

public class PokerGame {
    public static void main(String[] args) {
        String[] pokers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        int balance = 100;
        while(true) {
            out.printf("餘額 $%d\n", balance);
            Scanner sc = new Scanner(System.in);
            out.printf("請下注 : \n");
            int bet = sc.nextInt();
            if(balance - bet < 0) {
                out.printf("餘額不足, 請重新下注 : \n");
                continue;
            }
            // 扣除下注金
            balance = balance - bet;
            // 洗牌
            shuffle(pokers, 100);
            // pc 的牌 0, 2
            int pc   = getBaccaratScore(pokers[0], pokers[2]);
            // user 的牌 1, 3
            int user = getBaccaratScore(pokers[1], pokers[3]);
            // 得分 score
            int result = user - pc;
            if(result >= 0) {
                balance = balance + (bet)*2;
            }
            // 列印結果
            out.printf("pc : [%s, %s] %d, user : [%s, %s] %d , winner : %s\n", 
                    pokers[0], pokers[2], pc, pokers[1], pokers[3], user, (result>=0)?"user":"pc");
            
            if(balance <= 0) {
                out.printf("餘額 $%d, Game Over !\n", balance);
                break;
            }
        }
    }
}
