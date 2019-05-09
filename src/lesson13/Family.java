package lesson13;

class Father {

    Number getSalary() {
        return 10_0000;
    }
}

class Son extends Father {

    @Override
    Integer getSalary() {
        return 1_0000;
    }

}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getSalary());
    }
}
