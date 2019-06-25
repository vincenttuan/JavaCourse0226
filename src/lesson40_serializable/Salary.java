package lesson40_serializable;

import java.io.Serializable;

public class Salary implements Serializable {
    private String name;
    private transient int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Salary{" + "name=" + name + ", money=" + money + '}';
    }
    
}
