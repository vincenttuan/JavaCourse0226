package lesson14__interface_abstractclass;

public abstract class ADog implements IDog {

    @Override
    public void eat() {
        System.out.println("狗飼料");
    }
    
    public abstract int getAvgLife();
    
}
