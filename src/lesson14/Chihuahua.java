package lesson14;

public class Chihuahua implements IDog {

    @Override
    public void eat() {
        System.out.println("狗飼料");
    }

    @Override
    public int speed() {
        return 2;
    }
    
}
