package lesson14;

public class EDog implements IDog {

    @Override
    public void eat() {
        System.out.println("9V電池");
    }

    @Override
    public int speed() {
        return 100;
    }
    
    @Override
    public int getPower() {
        return 10;
    }
    
}
