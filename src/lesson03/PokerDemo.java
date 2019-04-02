package lesson03;

import java.util.Random;

public class PokerDemo {
    public static void main(String[] args) {
        String[] pokers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        print(pokers);
        shuffle(pokers, 10); // 洗牌
        print(pokers);
        System.out.println("score = " + getBaccaratScore(pokers[0], pokers[1]));
        System.out.println("score = " + getSumScore(pokers[0], pokers[1]));
    }
    
    // 列印
    public static void print(String[] pokers) {
        for(int i=0;i<pokers.length;i++) {
            System.out.print(pokers[i] + " ");
        }
        System.out.println();
    }
    
    // 洗單次
    public static void shuffle(String[] pokers) {
        Random r = new Random();
        int p1 = r.nextInt(pokers.length); // 0~12
        int p2 = r.nextInt(pokers.length); // 0~12;
        
        String x = pokers[p1];
        String y = pokers[p2];
        
        pokers[p1] = y;
        pokers[p2] = x;
    }
    
    // 洗多次
    public static void shuffle(String[] pokers, int count) {
        for(int i=0;i<count;i++) {
            shuffle(pokers);
        }
    }
    
    // 計算單張卡片分數
    public static int getScore(String card) {
        switch(card) {
            case "A":
                return 1;
            case "10":    
            case "J":
            case "Q":
            case "K":    
                return 0;
        }
        return Integer.parseInt(card); // 字串轉數字
    }
    
    // 計算二張卡片餘數
    public static int getBaccaratScore(String card1, String card2) {
        int score = getScore(card1) + getScore(card2);
        score = score % 10;
        return score;
    }
    
    // 計算二張卡片總和
    public static int getSumScore(String card1, String card2) {
        int score = getScore(card1) + getScore(card2);
        return score;
    }
    
}
