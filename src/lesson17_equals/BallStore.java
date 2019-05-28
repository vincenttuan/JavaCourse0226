package lesson17_equals;

import java.util.HashSet;
import java.util.Set;

public class BallStore {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 100);
        Ball b2 = new Ball("red", 100);
        //System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        Set balls = new HashSet();
        balls.add(b1);
        balls.add(b2);
        System.out.println(balls);
        
    }
}
