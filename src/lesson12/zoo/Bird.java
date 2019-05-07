package lesson12.zoo;

public class Bird extends Animal {

    private static int count;

    public Bird() {
        setKind("鳥");
        setLegs(2);
    }

    @Override
    public void move() {
        System.out.println("飛翔");
    }
    
    public static int getCount() {
        return count;
    }

}
