package lesson01;

public class DogHouse {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        
        dog1.kind = "拉不拉多";
        dog1.age = 3;
        
        dog2.kind = "柴犬";
        dog2.age = 2;
        
        System.out.printf("我有一隻%s色%d歲的%s\n", dog1.color, dog1.age, dog1.kind);
        System.out.printf("我有一隻%s色%d歲的%s\n", dog2.color, dog2.age, dog2.kind);
        
    }
}
