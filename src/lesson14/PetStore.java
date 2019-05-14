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
    }
    
    public void print(IDog dog) {
        System.out.println(dog.getClass().getSimpleName() + " 有 " + IDog.legs + " 隻腳");
        dog.eat();
        System.out.println("速度:" + dog.speed());
        System.out.println("----------------");
    }
}
