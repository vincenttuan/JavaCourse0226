package lesson14;

public class Shiba implements IDog {

    @Override
    public void eat() {
        System.out.println("狗飼料");
    }

    @Override
    public int speed() {
        return 10;
    }
    
}
