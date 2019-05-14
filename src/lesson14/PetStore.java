package lesson14;

public class PetStore {
    public static void main(String[] args) {
        PetStore store = new PetStore();
        Chihuahua chihuahua = new Chihuahua();
        store.print(chihuahua);
        Wolf wolf = new Wolf();
        store.print(wolf);
        Shiba shiba = new Shiba();
        store.print(shiba);
        EDog eDog = new EDog();
        store.print(eDog);
    }
    
    public void print(IDog dog) {
        System.out.println(dog.getClass().getSimpleName() + " 有 " + IDog.legs + " 隻腳");
        dog.eat();
        System.out.println("速度:" + dog.speed());
        System.out.println("狗力:" + dog.getPower());
        System.out.println("----------------");
    }
    
    public void print(ADog dog) {
        System.out.println(dog.getClass().getSimpleName() + " 平均年齡 " + dog.getAvgLife() + " 歲");
        print((IDog)dog);
    }
    
}
