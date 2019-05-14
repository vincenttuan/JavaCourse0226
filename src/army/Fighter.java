package army;

public class Fighter extends Airplane implements Weapon {
    
    @Override
    void move() {
        System.out.println("飛翔");
    }

    @Override
    public void shoot() {
        System.out.println("火箭炮");
    }

    @Override
    public String toString() {
        return "Fighter{" + '}';
    }
    
}
