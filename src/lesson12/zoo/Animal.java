package lesson12.zoo;

public class Animal {
    private int legs;
    private String kind;
    private static int count;

    public Animal() {
        ++count;
    }

    public Animal(int legs) {
        this.legs = legs;
        ++count;
    }
    
    public void eat() {
        
    }
    
    public void move() {
        
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public static int getCount() {
        return count;
    }
    
    
}
