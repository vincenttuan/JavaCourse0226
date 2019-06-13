package lesson30_wait_notify;

public class Fish {
    private int nums;
    private boolean empty = true;

    public Fish(int nums) {
        this.nums = nums;
    }

    public int getNums() {
        return nums;
    }
    
    public synchronized void put(int i) throws Exception {
        while(!empty) {
            wait();
        }
        System.out.printf("女主人放第 %d 片餅乾\n", i);
        empty = false;
        notifyAll();
    }
    
    public synchronized void eat(int i) throws Exception {
        while(empty) {
            wait();
        }
        System.out.printf("小花貓吃了第 %d 片餅乾\n", i);
        empty = true;
        notifyAll();
    }
}
