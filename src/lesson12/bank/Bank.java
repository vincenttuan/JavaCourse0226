package lesson12.bank;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.setMoney(10000);
        account.setMoney(20000);
        account.setMoney(-3000);
        account.setMoney(-23000);
        account.setMoney(-5000);
        System.out.println(account.getMoney("12345"));
    }
}
