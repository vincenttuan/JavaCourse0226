package lab;

import java.util.Random;

public class CheckLevel {
    public static void main(String[] args) {
        int score = new Random().nextInt(101);
        System.out.println(score);
        score = score / 10;
        System.out.println(score);
        
        switch(score){
            case 10:
            case 9:
                System.out.println("Level = A");
                break;
            case 8:
                System.out.println("Level = B");
                break;
            case 7:
                System.out.println("Level = C");
                break;
            case 6:
                System.out.println("Level = D");
                break;
            default:
                System.out.println("Level = E");
        }
        
    }
}
