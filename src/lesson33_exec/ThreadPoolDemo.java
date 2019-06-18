package lesson33_exec;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

public class ThreadPoolDemo {
    static int i = 5;
    public static void main(String[] args) throws Exception {
        Runnable lotto = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            System.out.println("Lotto : " + new Random().nextInt(100));
            i--;
        };
        //ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
        long start = new Date().getTime();
        
        IntStream.range(0, i).forEach(n -> exec.submit(lotto));
                        
        System.out.println("Thread count : " + Thread.activeCount());
        exec.shutdown();
        
        while(i != 0) {
            Thread.sleep(1);
        }
        long end = new Date().getTime();
        System.out.println("end - start = " + (end - start) + " ms");

    }
}
