package lesson31_cyclicbarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " 出發了");
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.println(tName + " 到台中了, 等待其他車子...");
            cb.await();
        } catch (Exception e) {
        }
        System.out.println(tName + " 繼續往高雄方向前進...");
    }
    
}
