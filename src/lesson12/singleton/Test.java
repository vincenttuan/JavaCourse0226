package lesson12.singleton;

public class Test {
    public static void main(String[] args) {
        MyCalc myCalc = MyCalc.getInstance();
        System.out.println(myCalc.add(10, 20));
        System.out.println(myCalc.bmi(170, 60));
        MyCalc myCalc2 = MyCalc.getInstance();
        System.out.println(myCalc2.add(15, 24));
        System.out.println(myCalc2.bmi(174, 50));
        
    }
}
