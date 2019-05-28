package lesson05_multi_array;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class WrapperTest5 {
    public static void main(String[] args) {
        calcBMI();
    }
    
    private static void calcBMI() {
        String height = JOptionPane.showInputDialog("請輸入身高 ?");
        String weight = JOptionPane.showInputDialog("請輸入體重 ?");
        double h = Double.valueOf(height);
        double w = Double.valueOf(weight);
        double bmi = w/Math.pow(h/100, 2);
        JOptionPane.showMessageDialog(null, String.format("%.2f", bmi));
        int x = JOptionPane.showConfirmDialog(null, "是否要繼續 ?");
        System.out.println("x = " + x);
        if(x == 0) {
            calcBMI();
        }
    }
}
