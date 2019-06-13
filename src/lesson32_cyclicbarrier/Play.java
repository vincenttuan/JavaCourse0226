package lesson32_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Play {
    public static void main(String[] args) {
        String[] referees = {"AP", "B", "CK", "Dan", "Ey"};
        int n = referees.length;
        Runnable job = () -> {
            double avg = Referee.scores.stream().mapToInt(score -> score).average().getAsDouble();
            System.out.println(Thread.currentThread().getName() + " 算得的平均 = " +avg);
            System.out.println(Referee.scores);
        };
        
        CyclicBarrier cb = new CyclicBarrier(n, job);
        
        for(String tName : referees) {
            new Referee(cb, tName).start();
        }
    }
}
