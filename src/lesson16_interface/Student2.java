package lesson16_interface;

public class Student2 implements IScore{

    @Override
    public int[] getScore() {
        return new int[]{12, 13, 14, 15, 16};
    }
    
}
