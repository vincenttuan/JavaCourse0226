package lab;

import java.util.Random;
import java.util.Scanner;

public class WhileGame {
    public static void main(String[] args) {
        
        int win_amount = 0;
        boolean play = true;
        while(play) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("剪刀=2 石頭=0 布=5");
            int user = scanner.nextInt();
            int pc = new Random().nextInt(3);
            pc = (pc == 1)?5:pc;
            System.out.printf("user=%d vs pc=%d\n", user, pc);
            switch(user-pc) {
                case -2:
                case 5:    
                case -3:
                    System.out.println("玩家贏");
                    win_amount++;
                    break;
                case 0:
                    System.out.println("平手");
                    break;
                default:
                    System.out.println("玩家輸了");
                    play = false;
            }
        }
        System.out.printf("玩家贏了 %d 次\n", win_amount);
    }
}
