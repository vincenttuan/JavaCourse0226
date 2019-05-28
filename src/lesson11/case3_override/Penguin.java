package lesson11.case3_override;

public class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("游泳");
    }
    
    public void skill() {
        System.out.println("抓魚");
    }
}
