package lesson12.zoo;

public class Zoo {

    public Zoo() {
    }
    
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.printf("%s 有 %d 隻腳\n" , bird.getKind(), bird.getLegs());
        bird.move();
        
        Lion lion = new Lion();
        System.out.printf("%s 有 %d 隻腳\n" , lion.getKind(), lion.getLegs());
        lion.move();
    }
}
