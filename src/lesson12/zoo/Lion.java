package lesson12.zoo;

public class Lion extends Animal {

    private static int count;

    public Lion() {
        setKind("獅子");
        setLegs(4);
        ++count;
    }

    public void move() {
        System.out.println("跑");
    }

    public static int getCount() {
        return count;
    }
}
