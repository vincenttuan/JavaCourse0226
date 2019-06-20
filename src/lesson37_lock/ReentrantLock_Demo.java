package lesson37_lock;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class ReentrantLock_Demo {
    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        Runnable lotto = () -> {
            try {
                lock.lock();
                IntStream.range(0, 5).forEach(x -> {
                    String tName = Thread.currentThread().getName();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                    System.out.println(tName + " : " + new Random().nextInt(100));
                });
            } catch (Exception e) {
            } finally {
                lock.unlock();
            }
            
        };
        
        Thread t1 = new Thread(lotto, "Vincent");
        Thread t2 = new Thread(lotto, "Anita");
        t1.start();
        t2.start();
        
        
    }
}
