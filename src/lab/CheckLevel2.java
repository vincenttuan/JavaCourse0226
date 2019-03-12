package lab;

import java.util.Random;

public class CheckLevel2 {
    public static void main(String[] args) {
        int score = new Random().nextInt(101);
        System.out.println(score);
        score = score / 10;
        System.out.println(score);
        
        score = (score<5)?5:score;
        score = (score==10)?9:score;
        
        // ?: 二組合併
        //score = (score<5)?5:(score==10)?9:score;
        
        System.out.printf("Level = %c\n", 65+9-score);
        
    }
}
