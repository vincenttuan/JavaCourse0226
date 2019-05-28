package lesson10_constructor;

public class BMI {
    public double h;
    public double w;
    public double bmi;
    
    // 建構子 (new 的時候會呼叫)
    public BMI(double h, double w) {
        this.h = h;
        this.w = w;
        bmi = calcBMI();
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

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + ", bmi=" + bmi + '}';
    }
    
    
}
