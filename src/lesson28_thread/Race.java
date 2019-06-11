package lesson28_thread;

public class Race implements Runnable {
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=10000;i++) {
            System.out.println(tName + " 跑了 " + i + " 步");
        }
    }
}
