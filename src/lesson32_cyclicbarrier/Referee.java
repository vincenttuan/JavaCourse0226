package lesson32_cyclicbarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Referee extends Thread {
    static List<Integer> scores = new ArrayList<>();
    CyclicBarrier cb;
    String tName;
    public Referee(CyclicBarrier cb, String tName) {
        this.cb = cb;
        this.tName = tName;
        setName(tName);
    }
    
    @Override
    public void run() {
        System.out.println(tName + " 評分中 ...");
        try {
            Thread.sleep(new Random().nextInt(5000));
            int score = new Random().nextInt(11);
            scores.add(score);
            System.out.println(tName + " 評分 = " + score);
            cb.await();
        } catch (Exception e) {
        }
    }
    
}
