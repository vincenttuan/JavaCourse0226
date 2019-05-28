package lesson14__interface_abstractclass;

public class Wolf extends ADog {

    @Override
    public int speed() {
        return 30;
    }
    
    @Override
    public int getAvgLife() {
        return 15;
    }
    
    @Override
    public int getPower() {
        return 5;
    }
    
}
