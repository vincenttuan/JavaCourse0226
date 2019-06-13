package lesson31_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Start {
    public static void main(String[] args) {
        int n = 4;
        CyclicBarrier cb = new CyclicBarrier(4);
        for(int i=0;i<n;i++) {
            new Car(cb).start();
        }
    }
}
