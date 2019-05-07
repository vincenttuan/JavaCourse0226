package lesson12.singleton;

public class MyCalc {
    
    // 2 自行創建一個類別物件
    private static MyCalc instance = new MyCalc();
    
    // 1. 將建構子設定為 private, 目的是不讓其他程式透過 new 建立實體
    private MyCalc() {
        System.out.println("MyCalc()建構子");
    }
    
    // 3. 提供一個類別方法, 供外界取得 instance 的參考
    public static MyCalc getInstance() {
        return instance;
    }
    
    public int add(int x, int y) {
        return x + y;
    }
    public double bmi(double h, double w) {
        return w / Math.pow(h/100, 2);
    }
    // ...
}
