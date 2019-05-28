package lesson11.case3_override;

public class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("飛翔");
    }
    
    public void eat() {
        System.out.println("吃東西");
    }
}
