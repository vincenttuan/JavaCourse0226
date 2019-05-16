package lesson17;

public class BallStore {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 100);
        Ball b2 = new Ball("blue", 200);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
