package lesson29_sync;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {
    // 餘額
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    // 餘額查詢
    public int getBalance() {
        return balance;
    }

    public synchronized void setBalance(int balance) {
        this.balance = balance;
    }
    
    // 提款方法
    public synchronized void withdraw(int money) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " 開始提款");
        int current_balance = getBalance(); // 取得目前餘額
        
        try {
            Thread.sleep(100); // 模擬提款所花費的時間
        } catch (InterruptedException ex) {
        }
        
        if(current_balance - money >= 0) { // 判斷餘額是否足夠提款 ?
            current_balance = current_balance - money;
            setBalance(current_balance);
            System.out.printf("%s 提款 $ %d 成功, 帳戶餘額 : $ %d\n", tName, money, getBalance());
        } else {
            System.out.printf("%s 提款 $ %d 失敗, 帳戶餘額 : $ %d\n", tName, money, getBalance());
        }
    }
    
}
