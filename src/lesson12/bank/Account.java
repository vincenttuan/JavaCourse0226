package lesson12.bank;

public class Account {
    private int money;

    public int getMoney(String password) {
        if(password.equals("1234")) {
            return money;
        }
        return 0;
    }

    public void setMoney(int money) {
        if((this.money + money) < 0) {
            System.out.println("餘額不足");
            return;
        }
        this.money += money;
    }
    
}
