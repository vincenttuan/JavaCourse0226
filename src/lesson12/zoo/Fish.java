package lesson12.zoo;

public class Fish extends Animal {

    private static int count;

    public Fish() {
        setKind("魚");
        ++count;
    }

    public void move() {
        System.out.println("游泳");
    }

    public static int getCount() {
        return count;
    }
}
