package lesson28_thread;

class Father extends Thread {

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話叫瓦斯");
        Worker worker = new Worker();
        worker.start();
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("工人開始送瓦斯");
        for(int i=1;i<=5;i++) { 
            try {
                // 模擬運送瓦斯花費的時間
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("工人發生意外, " + ex);
                return;
            }
            System.out.println(i + " 秒鐘");
        }
        System.out.println("工人送到了");
        System.out.println("工人裝好瓦斯了");
    }
}

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
