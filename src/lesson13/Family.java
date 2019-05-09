package lesson13;

class Father {
    int money = 10_0000;
    Number getSalary() {
        return money;
    }
}

class Son extends Father {
    int money = 1_0000;
    @Override
    Integer getSalary() {
        return money;
    }

}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getSalary());
        System.out.println(son.money);
    }
}
