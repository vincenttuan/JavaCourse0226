package lesson24_thread;

public class Job extends Thread {

    @Override
    public void run() { // 工作清單
        // Thread 名稱
        String threadName = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.println(threadName + " 跑了 " + i + " 步");
        }
    }
    
}
