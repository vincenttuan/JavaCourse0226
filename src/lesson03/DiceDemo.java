package lesson03;

import java.util.Random;
import static java.lang.System.out;

public class DiceDemo {
    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5, 6};
        int point = throwDice(dice);
        out.println(point);
        int[] result = throwDice(dice, 3);
        print(result);
    }
    
    // 拋 1 顆骰子
    public static int throwDice(int[] dice) {
        int point = dice[new Random().nextInt(dice.length)];
        return point;
    }
    // 拋 n 顆骰子
    public static int[] throwDice(int[] dice, int amount) {
        int[] result = new int[amount];
        for(int i=0;i<amount;i++) {
            result[i] = throwDice(dice);
        }
        return result;
    }
    // 列出骰子
    public static void print(int[] dice) {
        out.print("[");
        for(int i=0;i<dice.length;i++) {
            out.print(dice[i]);
            if(i < dice.length-1) {
                System.out.print(", ");
            }
        }
        out.println("]");
    }
}
