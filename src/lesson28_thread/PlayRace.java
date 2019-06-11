package lesson28_thread;

public class PlayRace {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Race(), "烏龜");
        Thread t2 = new Thread(new Race(), "兔子");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
        
    }
}
