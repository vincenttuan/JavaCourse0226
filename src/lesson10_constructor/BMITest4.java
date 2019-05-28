package lesson10_constructor;

import java.util.ArrayList;

public class BMITest4 {
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
        double max = list.stream()
                .filter(bmi -> bmi.bmi > 18 && bmi.bmi <= 23)
                //.peek(bmi -> System.out.println(bmi))
                .mapToDouble(bmi -> bmi.bmi)
                .peek(n -> System.out.println(n))
                .max()
                .getAsDouble();
        System.out.println("\nmax=" + max);
    }
}
