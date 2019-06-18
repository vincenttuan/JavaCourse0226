package lesson34_sched;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SingleScheduled {
    public static void main(String[] args) throws Exception {
        Callable<Integer> lotto = () -> new Random().nextInt(100);
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停 3 秒後執行");
        ScheduledFuture future = exec.schedule(lotto, 3, TimeUnit.SECONDS);
        System.out.println(future.get());
        exec.shutdown();
    }
}
