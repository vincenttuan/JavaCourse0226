package lesson13;

/*
    方法超載
*/
public class ShoppingCar {
    public boolean submit() throws Exception{
        return true;
    }
    public void submit(int money) {
    }
    private int submit(int money, int point) {
        return 0;
    }
    void submit(int money, float dc) {
    }
    public int submit(int money, int point, float dc) {
        return 0;
    }
}
