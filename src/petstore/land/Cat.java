package petstore.land;

import petstore.sky.Bird;
import petstore.water.Fish;

public class Cat extends Bird {
    public String name;
    public void play() {
        System.out.println("玩球");
        
        Dog dog = new Dog();
        dog.name = "小黃狗";
        System.out.print(dog.name + "喜歡");
        dog.play();
        
        //petstore.water.Fish fish = new petstore.water.Fish();
        Fish fish = new Fish();
        fish.name = "金魚";
        System.out.print(fish.name + "喜歡");
        fish.play();
        
        super.name = "白文鳥";
        System.out.print(super.name + "喜歡");
        super.play();
        
        
    }
}
