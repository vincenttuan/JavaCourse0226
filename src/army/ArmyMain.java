package army;

public class ArmyMain {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        ArmyMain army = new ArmyMain();
        army.move(fighter);
        army.move(tank);
        army.move(truck);
    }
    
    public void move(Car car) {
        car.move();
        if(car instanceof Weapon) {
            fire((Weapon) car);
        }
    }
    
    public void move(Airplane airplane) {
        airplane.move();
        if(airplane instanceof Weapon){
            fire((Weapon) airplane);
        }
    }
    
    public void fire(Weapon weapon) {
        weapon.shoot();
    }
}
