package lesson04;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        
        add(sb);
        System.out.println(sb);
        
        add(s);
        System.out.println(s);
        
        s = addAndGet(s);
        System.out.println(s);
    }
    
    public static void add(StringBuilder sb2) {
        sb2.append("8");
    }
    
    public static void add(String s2) {
        s2 = s2.concat("8");
    }
    
    public static String addAndGet(String s2) {
        s2 = s2.concat("8");
        return s2;
    }
    
    
    
}
