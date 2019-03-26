package lesson01;

public class Home {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Car car1 = new Car();
        
        dog1.kind = "拉不拉多";
        dog1.age = 3;
        dog1.color = "白";
        
        car1.brand = "Benz";
        car1.wheel = 4;
        car1.cc = 3000;
        
        System.out.printf("我有一隻%s色%d歲的%s犬\n", dog1.color, dog1.age, dog1.kind);
        System.out.printf("他最喜歡搭%dcc%d輪的%s\n", car1.cc, car1.wheel, car1.brand);
        
        
    }
}
