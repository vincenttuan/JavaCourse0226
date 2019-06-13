package lesson30_wait_notify;

public class Cookies {
    
    private int nums;
    private boolean empty = true; // 盤子是否是空的 ?

    public Cookies(int nums) {
        this.nums = nums;
    }

    public int getNums() {
        return nums;
    }
    
    public synchronized void put(int i) throws Exception {
        if(!empty) {
            wait();
        }
        System.out.printf("主人放第 %d 片餅乾\n", i);
        empty = false;
        notify();
    }
    
    public synchronized void eat(int i) throws Exception {
        if(empty) {
            wait();
        }
        System.out.printf("小白狗吃了第 %d 片餅乾\n", i);
        empty = true;
        notify();
    }
    
}
