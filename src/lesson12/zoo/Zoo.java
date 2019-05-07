package lesson12.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zoo {

    public Zoo() {
    }
    
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        System.out.printf("%s 有 %d 隻腳\n" , bird.getKind(), bird.getLegs());
//        bird.move();
//        Lion lion = new Lion();
//        System.out.printf("%s 有 %d 隻腳\n" , lion.getKind(), lion.getLegs());
//        lion.move();
//        System.out.println(Animal.getCount());
//        System.out.println(Bird.getCount());
        
        List<Animal> list = getAnimals();
        System.out.println(list);
        System.out.println(Bird.getCount() - Ostrich.getCount());
        System.out.println(Ostrich.getCount());
        System.out.println(Fish.getCount());
        System.out.println(Lion.getCount());
    
    }
    
    private static List<Animal> getAnimals() {
        List<Animal> list = new ArrayList<>();
        for(int i=0;i<5;i++) {
            int n = new Random().nextInt(4);
            switch(n) {
                case 0:
                    list.add(new Bird());
                    break;
                case 1:
                    list.add(new Fish());
                    break;
                case 2:
                    list.add(new Lion());
                    break;    
                case 3:
                    list.add(new Ostrich());
                    break;    
            }
        }
        return list;
    }
    
}
