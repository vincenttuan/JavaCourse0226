package lesson33_exec;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.stream.IntStream;

public class ExecutorDemo2 {
    public static void main(String[] args) {
        Executor exec = (r) -> new Thread(r).start();
        exec.execute(() -> System.out.println(new Date()));
        exec.execute(() -> System.out.println(new Random().nextInt(100)));
        exec.execute(() -> IntStream.range(0, 1000).forEach((n) -> System.out.println(n)));
    }
}
