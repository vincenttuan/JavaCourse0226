package lesson37_lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Atomic_Demo {
    static AtomicInteger x = new AtomicInteger();
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(x.incrementAndGet());
        };
        
        IntStream.range(0, 100).forEach(x -> {
            new Thread(r).start();
        });
        
    }
}
