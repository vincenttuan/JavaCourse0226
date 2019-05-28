package lesson10_constructor;

import java.util.ArrayList;

public class BMITest2 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI(170, 60);
        BMI bmi2 = new BMI(180, 70);
        BMI bmi3 = new BMI(160, 50);
        ArrayList<BMI> list = new ArrayList<>();
        list.add(bmi1);
        list.add(bmi2);
        list.add(bmi3);
        System.out.println(list);
        
    }
}
