package lesson20_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo2 {

    public static void main(String[] args) {
        // 除法
        div3();
    }

    public static void div() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字分子 = ");
        int x = scanner.nextInt();
        System.out.println("請輸入數字分母 = ");
        int y = scanner.nextInt();
        int z = x / y;
        System.out.println(z);
    }

    public static void div2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字分子 = ");
        int x = scanner.nextInt();
        System.out.println("請輸入數字分母 = ");
        int y = scanner.nextInt();
        if (y == 0) {
            System.out.println("分母不可為 0");
            return;
        }
        int z = x / y;
        System.out.println(z);

    }

    public static void div3() {
        int x=0, y=0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入數字分子 = ");
            x = scanner.nextInt();
            System.out.println("請輸入數字分母 = ");
            y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("錯誤訊息 : " + e);
            System.out.println("請輸入數字");
            return;
        }

        if (y == 0) {
            System.out.println("分母不可為 0");
            return;
        }
        int z = x / y;
        System.out.println(z);

    }
}
