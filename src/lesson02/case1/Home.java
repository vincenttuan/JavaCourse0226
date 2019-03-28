package lesson02.case1;

public class Home {
    public static void main(String[] args) {
        Dog1.kind = "拉不拉多";
        Dog1.color = "白色";
        
        Dog2.kind = "柴犬";
        Dog2.color = "黑色";
        
        System.out.println(Dog1.kind);
        System.out.println(Dog1.color);
        
        System.out.println(Dog2.kind);
        System.out.println(Dog2.color);
        
    }
}
