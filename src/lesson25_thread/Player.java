package lesson25_thread;

public class Player {
    public static void main(String[] args) {
        Run run = new Run();
        Walk walk = new Walk();
        
        Thread t = new Thread();
        t.start();
    }
}
