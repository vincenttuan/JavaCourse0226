package lesson34_sched;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SingleScheduled2 {
    public static void main(String[] args) throws Exception {
        Runnable lotto = () -> {
            System.out.println("Time : " + new Date() + " 開始");
            int delay = new Random().nextInt(3000);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            System.out.println("Time : " + new Date() + " Lotto : " + new Random().nextInt(100) + ", delay : " + delay);
            
        };
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停 3 秒後執行");
        ScheduledFuture future = exec.scheduleWithFixedDelay(lotto, 3, 2, TimeUnit.SECONDS);
        //ScheduledFuture future = exec.scheduleAtFixedRate(lotto, 3, 2, TimeUnit.SECONDS);
        future.get();
        exec.shutdown();
        
    }
}
