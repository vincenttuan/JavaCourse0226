package lesson35_forkjoin;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class FibonacciDemo {

    public static void main(String[] args) {
        long begin = new Date().getTime();
        forkjoin(35);
        long end = new Date().getTime();
        System.out.println(end - begin + " ms");
        
    }

    public static void recursively(int n) {
        int result = new Fibonacci().fibonacci(n);
        System.out.println(result);
    }

    public static void forkjoin(int n) {
        FibonacciTask task = new FibonacciTask(n);
        ForkJoinPool pool = new ForkJoinPool(4);
        pool.invoke(task);
        int result = task.getResult();
        System.out.println(result);
    }

    
}
