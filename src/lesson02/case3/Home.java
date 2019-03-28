package lesson02.case3;

public class Home {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog();
        dog1.kind = "拉不拉多";
        //dog1.color = "白"; // 不建議
        Dog.color = "白";
        
        Dog dog2 = new Dog();
        dog2.kind = "柴犬";
        //dog2.color = "黑"; // 不建議
        Dog.color = "黑";
        
        System.out.println(dog1.kind);
        System.out.println(dog1.color);
        
        System.out.println(dog2.kind);
        System.out.println(dog2.color);
        
    }
}
