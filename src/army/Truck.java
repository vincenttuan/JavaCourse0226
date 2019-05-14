package army;

public class Truck extends Car {

    public Truck() {
    }
    
    @Override
    void move() {
        System.out.println("用輪子走");
    }

    @Override
    public String toString() {
        return "Truck{" + '}';
    }
    
}
