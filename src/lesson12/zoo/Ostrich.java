package lesson12.zoo;

public class Ostrich extends Bird {

    private static int count;

    public Ostrich() {
        setKind("鴕鳥");
    }

    public void move() {
        System.out.println("跑 (不會飛)");
    }

    public void hideHead() {
        System.out.println("把頭藏起來");
    }

    public static int getCount() {
        return count;
    }
}
