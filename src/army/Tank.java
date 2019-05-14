package army;

public class Tank extends Car implements Weapon {

    @Override
    void move() {
        System.out.println("用履帶走");
    }

    @Override
    public void shoot() {
        System.out.println("榴彈砲");
    }

    @Override
    public String toString() {
        return "Tank{" + '}';
    }
    
}
