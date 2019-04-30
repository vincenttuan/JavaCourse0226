package lesson10;

public class BMI {
    public double h;
    public double w;
    private double bmi;
    
    // 建構子 (new 的時候會呼叫)
    public BMI(double h, double w) {
        this.h = h;
        this.w = w;
    }
    
    // 計算 bmi
    private double calcBMI() {
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
    
    // 列印 bmi
    public void printBMI() {
        if(bmi == 0) {
            bmi = calcBMI();
        }
        System.out.printf("%.2f\n", bmi);
    }
}
