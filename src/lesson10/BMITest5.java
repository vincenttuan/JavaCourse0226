package lesson10;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public class BMITest5 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI(170, 60);
        BMI bmi2 = new BMI(180, 70);
        BMI bmi3 = new BMI(160, 50);
        BMI bmi4 = new BMI(150, 65);
        BMI bmi5 = new BMI(190, 55);
        ArrayList<BMI> list = new ArrayList<>();
        list.add(bmi1);
        list.add(bmi2);
        list.add(bmi3);
        list.add(bmi4);
        list.add(bmi5);
        System.out.println(list + "\n");
        
        DoubleSummaryStatistics stat = list.stream()
                .mapToDouble(bmi -> bmi.bmi)
                .summaryStatistics();
        
        System.out.println(stat);
        System.out.println(stat.getAverage());
        
    }
}
