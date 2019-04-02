package lesson03;

import java.util.Scanner;

public class PokerGame {
    public static void main(String[] args) {
        String[] pokers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int balance = 100;
        while(true) {
            System.out.printf("餘額 $%d\n", balance);
            Scanner sc = new Scanner(System.in);
            System.out.printf("請下注 : \n");
            int bet = sc.nextInt();
            if(balance - bet < 0) {
                System.out.printf("餘額不足, 請重新下注 : \n");
                continue;
            }
            balance = balance - bet;
            // 洗牌
            PokerDemo.shuffle(pokers, 100);
            // pc 的牌 0, 2
            int pc   = PokerDemo.getBaccaratScore(pokers[0], pokers[2]);
            int user = PokerDemo.getBaccaratScore(pokers[1], pokers[3]);
            int result = user - pc;
            if(result >= 0) {
                balance = balance + (bet)*2;
            }
            System.out.printf("pc : [%s, %s] %d, user : [%s, %s] %d , winner : %s\n", 
                    pokers[0], pokers[2], pc, pokers[1], pokers[3], user, (result>=0)?"user":"pc");
            
            if(balance <= 0) {
                System.out.printf("餘額 $%d, Game Over !\n", balance);
                break;
            }
        }
    }
}
