package lesson11.case3_override;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.move();
        penguin.eat();
        penguin.skill();
        
        //Penguin penguin = new Bird();
        
        List<Penguin> zoo1 = new ArrayList<>();
        List<Bird> zoo2 = new ArrayList<>();
        List<Animal> zoo3 = new ArrayList<>();
        zoo3.add(penguin);
    }
}
