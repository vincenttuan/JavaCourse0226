package lesson30_wait_notify;

public class Play {
    public static void main(String[] args) {
        Cookies cookies = new Cookies(100);
        Master master = new Master(cookies);
        Dog dog = new Dog(cookies);
        
        Fish fish = new Fish(100);
        Madam madam = new Madam(fish);
        Cat cat = new Cat(fish);
        
        master.start();
        dog.start();

        madam.start();
        cat.start();
    }
}
