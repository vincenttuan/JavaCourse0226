package lesson24_thread;

public class ExecJob {
    public static void main(String[] args) {
        Job job = new Job();
        Job job2 = new Job();
        job.start();
        job2.start();
    }
}
