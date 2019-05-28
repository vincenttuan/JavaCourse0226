package lesson15_interface;

public class Student implements IBMI, IScore{

    @Override
    public double getHeight() {
        return 170;
    }

    @Override
    public double getWeight() {
        return 60;
    }

    @Override
    public int[] getScore() {
        return new int[]{100, 90, 80, 70, 60};
    }
    
}
