package lesson23_assert;

import java.util.Random;

public class AssertDemo {

    public static void main(String[] args) {
        while (true) {
            int x = new Random().nextInt(100);
            assert x >= 10 : x + ", 發生 assert error";
            System.out.println(x);
        }

    }
}
