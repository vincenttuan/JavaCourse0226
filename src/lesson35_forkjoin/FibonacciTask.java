package lesson35_forkjoin;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Integer>{
    private int num = 0;
    private int result = 0;

    public FibonacciTask(int num) {
        this.num = num;
    }

    public int getResult() {
        return result;
    }
    
    @Override
    protected Integer compute() {
        if(num < 36) { // 求解
            result = new Fibonacci().fibonacci(num);
        } else { // 拆分任務
            FibonacciTask task1 = new FibonacciTask(num - 1);
            task1.fork();
            FibonacciTask task2 = new FibonacciTask(num - 2);
            result = task2.compute() + task1.join();
        }
        return result;
    }
    
}
