package lesson28_thread;

import java.util.concurrent.FutureTask;

public class PlayLotto {
    public static void main(String[] args) throws Exception {
        System.out.println("取得 Lotto ...");
        FutureTask<Integer> task = new FutureTask<>(new Lotto());
        new Thread(task).start();
        Integer num = task.get(); // 取得 Lotto 的回傳直
        System.out.println("num = " + num);
    }
}
