package lesson33_exec;

import java.util.Date;
import java.util.concurrent.Executor;

public class ExecutorDemo {
    public static void main(String[] args) {
        java_7();
        java_8();
    }
    
    public static void java_7() {
        Runnable time_runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        
        Executor exec = new Executor() {
            @Override
            public void execute(Runnable runnable) {
                new Thread(runnable).start();
            }
        };
        
        exec.execute(time_runnable);
    }
    
    public static void java_8() {
        Runnable time_runnable = () -> System.out.println(new Date());
        Executor exec = (runnable) -> new Thread(runnable).start();
        exec.execute(time_runnable);
    }
    
    
}
