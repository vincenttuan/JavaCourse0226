package lesson28_thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000); // 模擬計算時間
        int num = new Random().nextInt(100);
        return num;
    }
    
}
