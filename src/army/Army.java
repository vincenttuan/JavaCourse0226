package army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;



public class Army {
    private List<Fighter> fighters = new ArrayList<>();
    private List<Tank> tanks = new ArrayList<>();
    private List<Truck> trucks = new ArrayList<>();

    public Army(int fighterCount, int tankCount, int truckCount) {
        
        IntStream.range(0, fighterCount).forEach(i -> fighters.add(new Fighter()));
        IntStream.range(0, tankCount).forEach(i -> tanks.add(new Tank()));
        IntStream.range(0, truckCount).forEach(i -> trucks.add(new Truck()));
        
        /*
        for(int i=0;i<fighterCount;i++) {
            fighters.add(new Fighter());
        }
        for(int i=0;i<tankCount;i++) {
            tanks.add(new Tank());
        }
        for(int i=0;i<truckCount;i++) {
            trucks.add(new Truck());
        }
        */
    }
    
    public void fighterPlay() {
        if(fighters.size() > 0) {
            Fighter fighter = fighters.get(0);
            fighter.move();
            fighter.shoot();
            fighters.remove(0);
        } else {
            System.out.println("沒飛機了");
        }
    }
    
    public void print() {
        System.out.println(fighters);
        System.out.println(tanks);
        System.out.println(trucks);
    }
}
