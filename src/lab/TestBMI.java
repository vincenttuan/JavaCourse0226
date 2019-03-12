package lab;

import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("BMI 指數測量");
        System.out.println("請輸入身高 cm ");
        double h = scanner.nextDouble();
        
        System.out.println("請輸入體重 kg ");
        double w = scanner.nextDouble();
        
        // 計算 bmi
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("bmi = %.2f\n", bmi);
        
        // 檢驗 bmi
        if(bmi >= 18 && bmi < 23) {
            System.out.println("正常");
        } else {
            System.out.println("不正常");
        }
        
    }
}
