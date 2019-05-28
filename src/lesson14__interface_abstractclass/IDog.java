package lesson14__interface_abstractclass;

public interface IDog extends IPower {
    public static final int legs = 4;
    public abstract void eat();
    public abstract int speed();
}
