package lesson01;

public class Car {
    String brand;
    int wheel;
    int cc;
    
    void speed(int value) {
        System.out.println("最高時數 " + value + " km");
    }
    
    // 搭車
    void getInto(Dog dog) {
        System.out.printf("%s終於搭上%s了並且探頭了\n", dog.kind, brand);
    }
    
}
