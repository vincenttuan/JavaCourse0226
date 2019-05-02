package lesson11.case3;

public class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("游泳");
    }
    
    public void skill() {
        System.out.println("抓魚");
    }
}
