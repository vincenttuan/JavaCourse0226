package lesson20_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputDemo3 {

    static List<Integer> nums = Arrays.asList(10, 5, 0, 2);

    public static void main(String[] args) {
        System.out.println("nums = " + nums);
        // 除法 1
        //div();
        
        // 除法 2
//        try {
//            div2();
//        } catch (RuntimeException e) {
//            System.out.println(e);
//        }
        
        try {
            div2();
        } catch (InputMismatchException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
    }

    public static void div() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入nums陣列維度當分子 = ");
            int x = scanner.nextInt();
            x = nums.get(x);
            System.out.println("請輸入nums陣列維度當分母 = ");
            int y = scanner.nextInt();
            y = nums.get(y);

            int z = x / y;
            System.out.println(z);
        } catch (InputMismatchException e) {
            System.out.println("請輸入數字");
            return;
        } catch (ArithmeticException e) {
            System.out.println("分母不可為 0");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("維度超過 nums 最大範圍 ( " + (nums.size() - 1) + ")");
            return;
        }
    }

    public static void div2() throws InputMismatchException, ArithmeticException, ArrayIndexOutOfBoundsException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入nums陣列維度當分子 = ");
        int x = scanner.nextInt();
        x = nums.get(x);
        System.out.println("請輸入nums陣列維度當分母 = ");
        int y = scanner.nextInt();
        y = nums.get(y);
        int z = x / y;
        System.out.println(z);
    }

}
