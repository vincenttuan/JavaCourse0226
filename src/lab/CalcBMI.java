package lab;

/**
 * 計算 BMI 值
 * @author vincent
 */
public class CalcBMI {
    /** 程式進入點
     * @param args 
     */
    public static void main(String[] args) {
        double h = 170.3; // 身高
        double w = 60.4; // 體重
        double bmi = w / Math.pow(h/100, 2); // 計算 bmi
        System.out.println(bmi); // 印出 bmi
        System.out.printf("%.2f\n", bmi); // 印出 bmi 小數點2位
        System.out.printf("身高= %.1f cm 體重= %.1f kg BMI= %.2f %n", h, w, bmi); // 完整印出
    }
    
}
